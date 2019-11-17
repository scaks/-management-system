package com.db.sys.service.impl;

import com.db.common.exception.ServiceException;
import com.db.sys.dao.SysMenuDao;
import com.db.sys.dao.SysRoleMenuDao;
import com.db.sys.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class SysMenuServiceImpl implements SysMenuService {

    @Autowired
     private SysMenuDao sysMenuDao;
    @Autowired
    private SysRoleMenuDao sysRoleMenuDao;

    @Override
    public List<Map<String, Object>> findObjects() {
        return sysMenuDao.findObjects();
    }

    @Override
    public int deleteObject(Integer id) {

        if(id==null || id<=0)
            throw new ServiceException("请先选择");
        int count = sysMenuDao.getChildCount(id);

        if(count != 0)
            throw new ServiceException("该菜单有子菜单不能直接删除");
        int rows;

        rows = sysMenuDao.deleteObject(id);
        sysRoleMenuDao.deleteObjectsByMenuId(id);

        if(rows == 0)
            throw new ServiceException("此菜单可能不存在");
        return rows;
    }

}

package com.db.sys.service.impl;

import com.db.sys.dao.SysMenuDao;
import com.db.sys.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SysMenuServiceImpl implements SysMenuService {

    @Autowired
     private SysMenuDao sysMenuDao;
    @Override
    public List<Map<String, Object>> findObjects() {
        return sysMenuDao.findObjects();
    }
}

package com.db.sys.service.impl;

import com.db.common.exception.ServiceException;
import com.db.common.vo.PageObject;
import com.db.sys.dao.SysLogDao;
import com.db.sys.entity.SysLog;
import com.db.sys.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysLogServiceImpl implements SysLogService {

    @Autowired
    private SysLogDao sysLogDao;
    @Override
    public PageObject<SysLog> findObjects(String username, Integer pageCurrent) {
        //1.验证参数合法性
        //1.1验证pageCurrent的合法性，
        //不合法抛出IllegalArgumentException异常
        if(null==pageCurrent || pageCurrent<1)
            throw new IllegalArgumentException("页码不正确");
        //2.基于条件查询总记录数
        //2.1) 执行查询
        int rowCount = sysLogDao.getRowCount(username);
        //2.2) 验证查询结果，假如结果为0不再执行如下操作
        if(rowCount==0)
            throw new ServiceException("没有对应记录");
        //3.基于条件查询当前页记录(pageSize定义为5)
        //3.1)定义pageSize
        int pageSize = 5;
        //3.2)计算startIndex
        int startIndex = (pageCurrent-1)*pageSize;
        //3.3)执行当前数据的查询操作
        List<SysLog> records = sysLogDao.findPageObjects(username, startIndex, pageSize);
        //4.对分页信息以及当前页记录进行封装
        //4.1)构建PageObject对象
        PageObject<SysLog> pageObject = new PageObject<>();
        //4.2)封装数据
        pageObject.setPageCurrent(pageCurrent);
        pageObject.setPageSize(pageSize);
        pageObject.setPageCount((rowCount-1)/pageSize+1);
        pageObject.setRecords(records);
        pageObject.setRowCount(rowCount);
        //5.返回封装结果。
        return pageObject;
    }

    @Override
    public int deleteObjects(Integer... ids) {
        if(null == ids || ids.length==0)
            throw new IllegalArgumentException("没有选中记录");
        int rows;
        try {
            rows = sysLogDao.deleteObjects(ids);
        }catch (Throwable e){
            e.printStackTrace();
            throw new ServiceException("系统故障");
        }
        if(rows==0)
            throw  new ServiceException("记录不存在");
        return rows;
    }

}

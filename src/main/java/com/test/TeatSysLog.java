package com.test;

import com.db.sys.dao.SysLogDao;
import com.db.sys.dao.SysMenuDao;
import org.junit.Test;

public class TeatSysLog extends TestBase{
    @Test
    public void testGetRowCount(){
        SysLogDao dao = cc.getBean("sysLogDao", SysLogDao.class);
        System.out.println(dao.getClass().getName());
        int rowCount = dao.getRowCount("admin");
        System.out.println(rowCount);

    }

    @Test
    public void testDelete(){
        SysMenuDao dao = cc.getBean("sysMenuDao", SysMenuDao.class);
        System.out.println(dao.getClass().getName());
        int rowCount = dao.deleteObject(162);
        System.out.println(rowCount);
    }

}

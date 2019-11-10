package com.test;

import com.db.sys.dao.SysLogDao;
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
        SysLogDao dao = cc.getBean("sysLogDao", SysLogDao.class);
        System.out.println(dao.getClass().getName());
        int rowCount = dao.deleteObjects(52,32);
        System.out.println(rowCount);
    }

}

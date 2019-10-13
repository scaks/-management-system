package com.test;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

public class TestMybatis extends TestBase{

    @Test
    public void testSqlSessionFaction(){
        SqlSessionFactory ssf = cc.getBean("sqlSessionFactory", SqlSessionFactory.class);
        System.out.println(ssf);
    }
}

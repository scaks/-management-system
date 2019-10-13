package com.test;

import org.junit.Test;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


public class TestDruidDataSource extends TestBase{
    @Test
    public void TestDataSource() throws SQLException {
        DataSource ds = cc.getBean("dataSource", DataSource.class);
        Connection conn = ds.getConnection();
        System.out.println(conn);
    }
}

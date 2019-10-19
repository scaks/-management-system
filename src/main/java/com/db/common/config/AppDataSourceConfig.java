package com.db.common.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@PropertySource(value="classpath:configs.properties")
@Configuration
public class AppDataSourceConfig {

    /**配置数据源对象:druid*/
    @Bean(value="dataSource")
    public DataSource newDataSource(Environment env) {
        DruidDataSource ds = new DruidDataSource();
        //ds.setDriverClassName(env.getProperty("jdbcDriver"));
        ds.setUrl(env.getProperty("jdbcUrl"));
        ds.setUsername(env.getProperty("jdbcUser"));
        ds.setPassword(env.getProperty("jdbcPassword"));
        return ds;
    }
}

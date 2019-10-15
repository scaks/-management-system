package com.db.common.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
//@MapperScan(basePackages="com.db.**.dao")
public class AppMyBatisConfig {

    @Bean("sqlSessionFactory")
    public SqlSessionFactoryBean newSqlSessionFactoryBean(DataSource dataSource) {
        //构建Bean对象
        SqlSessionFactoryBean fBean = new SqlSessionFactoryBean();
        //配置数据源
        fBean.setDataSource(dataSource);
        //设置映射文件
        /*Resource[] mapperLocations=
                new PathMatchingResourcePatternResolver()
                        .getResources("classpath:mapper/sys/*.xml");
        fBean.setMapperLocations(mapperLocations);*/
        return fBean;
    }
}

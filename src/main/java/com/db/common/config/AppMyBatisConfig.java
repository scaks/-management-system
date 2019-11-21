package com.db.common.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
@MapperScan(basePackages="com.db.**.dao")
@EnableTransactionManagement
public class AppMyBatisConfig {

    @Bean("sqlSessionFactory")
    public SqlSessionFactoryBean newSqlSessionFactoryBean(DataSource dataSource) throws IOException {
        //构建Bean对象
        SqlSessionFactoryBean fBean = new SqlSessionFactoryBean();
        //配置数据源
        fBean.setDataSource(dataSource);
        //设置映射文件
        Resource[] mapperLocations=
                new PathMatchingResourcePatternResolver()
                        .getResources("classpath:mapper/sys/*.xml");
        fBean.setMapperLocations(mapperLocations);
        return fBean;
    }


    /**
     * 注册事务管理器在容器中
     * @param dataSource
     * @return
     * @throws Exception
     */
    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource) throws Exception{
        return new DataSourceTransactionManager(dataSource);
    }
}

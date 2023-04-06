package com.example.demo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * com.example.demo.config
 * threadDBConfig
 *
 * @author leo
 * @Description
 * @date 2021/6/8 16:20
 */
@Configuration
@MapperScan(basePackages = {"com.example.demo.mapper.thread"}, sqlSessionFactoryRef = "threadSqlSessionFactory")
public class ThreadDBConfig {

    @Primary
    @Bean(name = "threadDataSource")
    @ConfigurationProperties(prefix="spring.datasource.thread")
    public DataSource firstDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "threadSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("threadDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath*:mapper/thread/*.xml"));
        return sessionFactoryBean.getObject();
    }
}

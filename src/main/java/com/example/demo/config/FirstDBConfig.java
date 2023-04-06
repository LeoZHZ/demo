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
 * @author ZZ
 * 本地数据库连接
 */
@SuppressWarnings("AlibabaClassNamingShouldBeCamel")
@Configuration
@MapperScan(basePackages = {"com.example.demo.mapper.first"}, sqlSessionFactoryRef = "firstSqlSessionFactory")
public class FirstDBConfig {

    @Primary
    @Bean(name = "firstDataSource")
    @ConfigurationProperties(prefix="spring.datasource.first")
    public DataSource firstDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "firstSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("firstDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath*:mapper/first/*.xml"));
        return sessionFactoryBean.getObject();
    }


}

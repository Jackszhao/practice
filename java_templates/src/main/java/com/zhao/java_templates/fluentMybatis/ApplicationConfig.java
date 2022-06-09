package com.zhao.java_templates.fluentMybatis;

import cn.org.atool.fluent.mybatis.spring.MapperFactory;
import org.apache.commons.dbcp.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan({"com.zhao.java_templates.fluentMybatis.mapper"})
public class ApplicationConfig {
    @Bean
    public DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/fluent_mybatis?useUnicode=true&characterEncoding=utf8");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        return dataSource;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource());
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        // 以下部分根据自己的实际情况配置
        // 如果有mybatis原生文件, 请在这里加载
        bean.setMapperLocations(resolver.getResources("classpath*:mapper/*.xml"));
        /* bean.setMapperLocations(
        /*      new ClassPathResource("mapper/xml1.xml"),
        /*      new ClassPathResource("mapper/xml2.xml")
        /* );
        */
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setLazyLoadingEnabled(true);
        configuration.setMapUnderscoreToCamelCase(true);
        bean.setConfiguration(configuration);
        return bean;
    }

    // 定义fluent mybatis的MapperFactory
    @Bean
    public MapperFactory mapperFactory() {
        return new MapperFactory();
    }
}
package com.example;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EntityScan("com.example.models")
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
public class MySQLAppConfig {

    @Value("${app.datasource.driverClassName}")
    String driverClassName;

    @Value("${app.datasource.url}")
    String url;

    @Value("${app.datasource.username}")
    String userName;

    @Value("${app.datasource.password}")
    String passWord;

    @Bean(name = "dataSource")
    public DataSource getDataSource() {
        DataSource dataSource = DataSourceBuilder.create()
                .username(userName)
                .password(passWord)
                .url(url)
                .driverClassName(driverClassName)
                .build();

        return dataSource;
    }

    @Bean(name = "sessionFactory")
    public SessionFactory getSessionFactory(DataSource dataSource) {

        LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
        sessionBuilder.scanPackages("com.example.models");
        return sessionBuilder.buildSessionFactory();
    }

    @Bean(name = "transactionManager")
    public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
        return transactionManager;
    }
    @Bean
    public DataSourceInitializer dataSourceInitializer(final DataSource dataSource){
        final DataSourceInitializer initializer = new DataSourceInitializer();
        initializer.setDataSource(dataSource);
        return initializer;
    }

}

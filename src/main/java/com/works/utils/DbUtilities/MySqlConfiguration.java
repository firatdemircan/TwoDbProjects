package com.works.utils.DbUtilities;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.util.Properties;
@Configuration
@EnableJpaAuditing
@EnableJpaRepositories(basePackages = "com.works.Repostories.MySqlRepostories",entityManagerFactoryRef = "mysqlEM")
public class MySqlConfiguration {

    @Primary
    @Bean(name = "mysql")
    @ConfigurationProperties("app.datasource")
    public DataSource mysqlDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "mySqlEM")

    public LocalContainerEntityManagerFactoryBean mySqlEM(@Qualifier("mysql") DataSource dataSource){
        Properties props = new Properties();
        props.put("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");

        HibernateJpaVendorAdapter jpaAdapter = new HibernateJpaVendorAdapter();
        jpaAdapter.setShowSql(true);
        jpaAdapter.setGenerateDdl(true);

        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        bean.setDataSource(dataSource);
        bean.setPersistenceUnitName("mysql");
        bean.setJpaVendorAdapter(jpaAdapter);
        bean.setPackagesToScan("com.works.Entity.MySqlEntity","com.works.Repostories.MySqlRepostories");
        bean.setJpaProperties(props);
        bean.afterPropertiesSet();
        return bean;
    }
}

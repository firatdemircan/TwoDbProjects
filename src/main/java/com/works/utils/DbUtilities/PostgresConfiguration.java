package com.works.utils.DbUtilities;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;


import javax.sql.DataSource;
import java.util.Properties;


@Configuration
@EnableJpaRepositories(basePackages = "com.works.Repostories.PostgresRepostories",entityManagerFactoryRef = "postgresEM")
public class PostgresConfiguration {

    @Primary
    @Bean(name = "postgres")
    @ConfigurationProperties("postgres.datasource")
    public DataSource postgresDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "postgresEM")

    public LocalContainerEntityManagerFactoryBean postgresEM(@Qualifier("postgres") DataSource dataSource){
        Properties props = new Properties();
        props.put("hibernate.dialect","org.hibernate.dialect.PostgreSQLDialect");

        HibernateJpaVendorAdapter jpaAdapter = new HibernateJpaVendorAdapter();
        jpaAdapter.setShowSql(true);
        jpaAdapter.setGenerateDdl(true);

        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        bean.setDataSource(dataSource);
        bean.setPersistenceUnitName("postgres");
        bean.setJpaVendorAdapter(jpaAdapter);
        bean.setPackagesToScan("com.works.Model.PostgresEntity","com.works.Repostories.PostgresRepostories");
        bean.setJpaProperties(props);
        bean.afterPropertiesSet();
        return bean;
    }

}

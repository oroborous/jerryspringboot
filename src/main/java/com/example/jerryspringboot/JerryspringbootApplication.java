package com.example.jerryspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@SpringBootApplication
public class JerryspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(JerryspringbootApplication.class, args);
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource("jdbc:oracle:thin:@localhost:1521:orclapps", "jerry", "jerry");
        dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
        return dataSource;
    }
}

package br.com.alura.listavip;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public DataSource dataSource() throws ClassNotFoundException{
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();	    
	    dataSource.setDriverClassName("com.mysql.jdbc.Driver");	    
	    dataSource.setUrl("jdbc:mysql://localhost:3306/listavip");
	    dataSource.setUsername("root");
	    dataSource.setPassword("admin");
	    return dataSource;
	}
}
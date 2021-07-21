package com.agroproduct.gov.lk.agroproduct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class AgroproductApplication  implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public static void main(String[] args) {
        SpringApplication.run(AgroproductApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String sql= "INSERT INTO login(username,password) VALUES(?,?)";
        int result=jdbcTemplate.update(sql,"Hemantha","123");
        if(result>0)
        {
            System.out.println("One record has added !");
        }


    }
}

package com.xworkz.froms.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xworkz.froms")

public class FromsConfig {

   public  FromsConfig(){
        System.out.println("no argu const in FromsConfig");
    }
}

package com.xworkz.job.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.job")
public class JobConfig {
   public JobConfig(){
       System.out.println("created no argu JobConfig");
   }
}

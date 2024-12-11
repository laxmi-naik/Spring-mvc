package com.xworkz.products.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.xworkz.products")
public class ProductsConfig {
        public ProductsConfig(){
            System.out.println("created no argu ProductsConfig");
        }
}

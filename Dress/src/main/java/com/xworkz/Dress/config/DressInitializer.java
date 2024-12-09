package com.xworkz.Dress.config;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DressInitializer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
    DressInitializer(){
        System.out.println("created DressInitializer");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        String [] urls={"/"};
        System.out.println("created DispatcherServlet");
        return  urls;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        System.out.println("configure to handle the server by itself");
        configurer.enable();
    }
}

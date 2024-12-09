package com.xworkz.springmvc.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class springInitializer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
    public springInitializer() {
        System.out.println("const SpringInitializer");
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
        System.out.println("created dispatcherServlet");
        return  urls;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        System.out.println("configure handling server by it self");
        configurer.enable();
    }
}

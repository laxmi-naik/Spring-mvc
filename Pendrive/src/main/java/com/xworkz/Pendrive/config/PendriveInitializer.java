package com.xworkz.Pendrive.config;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class PendriveInitializer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
    PendriveInitializer(){
        System.out.println("const PendriveInitializer");
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
      System.out.println("urls for DispatcherServlet");
      return  urls;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        System.out.println("configure to handle the server by itself");
        configurer.enable();
    }
}

package com.xworkz.springDemo.runner;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DemoInitializer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

    DemoInitializer(){
        System.out.println("const DemoInitializer");
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
        String[] urls={"/"};
        System.out.println("configured url to DispatcherServlet");
        return urls;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        System.out.println("enable static resource handling by server itself");
        configurer.enable();
    }
}

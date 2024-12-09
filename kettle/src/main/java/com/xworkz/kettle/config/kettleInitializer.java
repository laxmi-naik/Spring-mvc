package com.xworkz.kettle.config;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class kettleInitializer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
    kettleInitializer(){
        System.out.println("const kettleInitializer");
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
        System.out.println("created DispatcherServlet");
        return urls;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        System.out.println("configure handling server by itself");
        configurer.enable();
    }
}

package com.xworkz.watch.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class watchInitializer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
    watchInitializer(){
        System.out.println("const watchInitializer");
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
      System.out.println("dispatcher Servlet");
      return urls;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        System.out.println("configure server by handling itself");
        configurer.enable();
    }
}

package com.xworkz.job.init;

import com.xworkz.job.config.JobConfig;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class JobInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
    public JobInit(){
        System.out.println("const in FromsInit");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{JobConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("url is created");
        return new String[]{"/"};
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        System.out.println("configure to handle the server by itself");
        configurer.enable();
    }
}


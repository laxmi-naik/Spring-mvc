package com.xworkz.speaker.runner;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpeakerInitializer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
    SpeakerInitializer(){
        System.out.println("const SpeakerInitializer");
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
        String[] urls = {"/"};
        System.out.println("configured urls for DispatcherServlet");
        return urls;
    }
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
            System.out.println("enable static resource handling by server it self");
            configurer.enable();
    }
}

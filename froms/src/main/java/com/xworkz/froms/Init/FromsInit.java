package com.xworkz.froms.Init;

import com.xworkz.froms.config.FromsConfig;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


    public class FromsInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
       public FromsInit(){
            System.out.println("const in FromsInit");
        }

        @Override
        protected Class<?>[] getRootConfigClasses() {
            return new Class[0];
        }

        @Override
        protected Class<?>[] getServletConfigClasses() {
            return new Class[]{FromsConfig.class};
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



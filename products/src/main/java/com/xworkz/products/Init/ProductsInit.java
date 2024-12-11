package com.xworkz.products.Init;

import com.xworkz.products.config.ProductsConfig;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ProductsInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
    public ProductsInit(){
        System.out.println("created no argu const ProductsInit");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ProductsConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        System.out.println("created configurer");
        configurer.enable();
    }
}

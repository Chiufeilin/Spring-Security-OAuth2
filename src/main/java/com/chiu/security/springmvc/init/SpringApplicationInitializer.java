package com.chiu.security.springmvc.init;

import com.chiu.security.springmvc.comfig.ApplicationConfig;
import com.chiu.security.springmvc.comfig.WebConfig;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    //spring 容器  相当于加载 applicationContext.xml
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ApplicationConfig.class};
    }

    // servletContext 相当于加载springmvc.xml
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    // URL-mapping
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}

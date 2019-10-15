package com.db.common.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@ComponentScan(value = "com.db",
        includeFilters={@ComponentScan.Filter(type= FilterType.ANNOTATION,
                classes={Controller.class, ControllerAdvice.class})},
        useDefaultFilters=false)
@EnableWebMvc
public class AppMvcConfig extends WebMvcConfigurerAdapter {

    /**配置视图解析器*/
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/pages/",".html");
    }
}

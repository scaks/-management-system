package com.db.common.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;


@Configuration
@ComponentScan(value="com.db",
        excludeFilters={@ComponentScan.Filter(type= FilterType.ANNOTATION,
                classes={Controller.class, ControllerAdvice.class})})
public class AppRootConfig {

}

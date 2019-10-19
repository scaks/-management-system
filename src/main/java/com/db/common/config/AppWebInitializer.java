package com.db.common.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.util.Log4jConfigListener;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * 此类中负责执行前端控制器以及相关bean组件的加载和注册
 * 说明：此对象要承担web.xml的作用
 */
public class AppWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * 此方法加载service,dao等相关bean对象
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("--getRootConfigClasses--");
        return new Class[]{AppRootConfig.class};
    }
    /**
     * 此方法中负责加载spring mvc 中的v,c等相关组件
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("--getServletConfigClasses--");
        return new Class[]{AppMvcConfig.class};
    }
    /**
     * 此方法定义请求映射
     */
    @Override
    protected String[] getServletMappings() {
        System.out.println("--getServletMappings--");
        return new String[]{"*.do"};
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        // TODO Auto-generated method stub
        System.out.println("--onStartup--");
        servletContext.addListener(Log4jConfigListener.class);
        servletContext.setInitParameter("webAppRootKey", "spring4.root");
        servletContext.setInitParameter("log4jConfigLocation", "classpath:log4j.properties");
        servletContext.setInitParameter("log4jRefreshInterval", "10000");
        super.onStartup(servletContext);
    }

}

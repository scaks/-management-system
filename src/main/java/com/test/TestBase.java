package com.test;


import com.db.common.cache.LruCache;
import com.db.common.config.AppRootConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestBase {
    protected AnnotationConfigApplicationContext cc;
    @Before
    public void init(){
         cc = new AnnotationConfigApplicationContext(AppRootConfig.class);
    }
    @Test
    public void testSpring(){
        System.out.println(cc);
    }
    @Test
    public void testLruCache(){
        LruCache lrucache = cc.getBean("lruCache", LruCache.class);
        System.out.println(lrucache);
    }
    @After
    public void close(){
        cc.close();
    }
}

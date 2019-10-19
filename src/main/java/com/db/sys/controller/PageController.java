package com.db.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class PageController {

    /**
     * 返回系统首页
     */
    @RequestMapping("Index")
    public String doIndexUI(){
        System.out.println("--Index--");
        return "starter";
    }

    /**
     * 加载分页页面
     * @return page.html
     */
    @RequestMapping("doPageUI")
    public String doPageUI(){
        return "common/page";
    }

}

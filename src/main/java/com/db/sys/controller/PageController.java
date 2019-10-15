package com.db.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    /**
     * 返回系统首页
     */
    @RequestMapping("/index")
    public String doIndexUI(){
        return "starter";
    }
}

package com.db.sys.controller;

import com.db.common.vo.JsonResult;
import com.db.sys.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/menu/")
public class SysMenuController {

    @Autowired
    private SysMenuService sysMenuService;

    @RequestMapping("doMenuListUI")
    public String doMenuListUI(){
        return "sys/menu_list";
    }

    @ResponseBody
    @RequestMapping("doFindObjects")
    public JsonResult  doFindObjects(){
        List<Map<String,Object>> pageObject = sysMenuService.findObjects();
        return new JsonResult(pageObject);
    }
}
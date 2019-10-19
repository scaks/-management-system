package com.db.sys.controller;

import com.db.common.vo.PageObject;
import com.db.sys.entity.SysLog;
import com.db.sys.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/log/")
public class SysLogController {

    @Autowired
    private SysLogService sysLogService;

    @RequestMapping("doLogListUI")
    public String doLogListUI(){
        return "sys/log_list";
    }

    @ResponseBody
    @RequestMapping("doFindPageObjects")
    public PageObject<SysLog> doFindPageObjects(String username, Integer pageCurrent){
        PageObject<SysLog> pageObject = sysLogService.findObjects(username, pageCurrent);
        return pageObject;
    }

}

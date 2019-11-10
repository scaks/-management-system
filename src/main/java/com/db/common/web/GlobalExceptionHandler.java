package com.db.common.web;

import com.db.common.vo.JsonResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**全局异常处理类*/
@ControllerAdvice
public class GlobalExceptionHandler {

    //JDK中的自带的日志API
    @ResponseBody
    @ExceptionHandler(RuntimeException.class)
    public JsonResult doHandleRuntimeException(
            RuntimeException e){
        e.printStackTrace();//也可以写日志
        return new JsonResult(e);//封装异常信息
    }

}

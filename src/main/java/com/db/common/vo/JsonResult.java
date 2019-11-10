package com.db.common.vo;

import java.io.Serializable;

public class JsonResult implements Serializable {
    private static final long serialVersionUID = -1118544514037552262L;
    /**状态码*/
    private int state=1;//1表示SUCCESS,0表示ERROR
    /**状态信息*/
    private String message="ok";
    /**正确数据*/
    private Object data;

    public JsonResult() {
    }

    public JsonResult(String message) {
        this.message = message;
    }

    public JsonResult(Object data) {
        this.data = data;
    }
    public JsonResult(Throwable ex) {
        this.state = 0;
        this.message = ex.getMessage();
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

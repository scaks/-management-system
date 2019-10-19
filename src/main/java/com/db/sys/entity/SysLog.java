package com.db.sys.entity;

import java.io.Serializable;
import java.util.Date;

public class SysLog implements Serializable {

    private static final long serialVersionUID = -3243241663066698922L;
    private Integer id;
    /**用户名*/
    private String username;
    /**用户操作*/
    private String operation;
    /**请求方法*/
    private String method;
    /**请求参数*/
    private String params;
    /**请求参数*/
    private Long time;
    /**IP地址*/
    private String ip;
    /**IP地址*/
    private Date createdTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}

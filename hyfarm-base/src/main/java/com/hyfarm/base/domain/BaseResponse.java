package com.hyfarm.base.domain;

import java.io.Serializable;

public class BaseResponse implements Serializable {

    private static final long serialVersionUID = -7161472838749220765L;

    private String code;
    private Object result;
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

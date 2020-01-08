package com.hyfarm.base.controller;

import com.hyfarm.base.domain.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * controller 层的基本父类
 */
public class BaseController {

    protected static final String OK_STATUS="0000";
    protected static final String ON_OK_STATUS="0001";
    /**
     * 日志对象
     */
    protected Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 成功返回
     * @param result
     * @return
     */
    public static BaseResponse buildSuccessResponse(Object result) {
        BaseResponse response = new BaseResponse();
        response.setCode(BaseController.OK_STATUS);
        response.setResult(result);
        return response;
    }
    /**
     * 成功返回
     * @param msg
     * @return
     */
    public static BaseResponse buildSuccessResponse(String  msg) {
        BaseResponse response = new BaseResponse();
        response.setCode(BaseController.OK_STATUS);
        response.setMsg(msg);
        return response;
    }
    /**
     * 成功返回
     * @param msg
     * @return
     */
    public static BaseResponse buildSuccessResponse(String msg,Object result) {
        BaseResponse response = new BaseResponse();
        response.setCode(BaseController.OK_STATUS);
        response.setMsg(msg);
        response.setResult(result);
        return response;
    }

    /**
     * 成功失败
     * @param result
     * @return
     */
    public static BaseResponse buildFailResponse(Object result) {
        BaseResponse response = new BaseResponse();
        response.setCode(BaseController.ON_OK_STATUS);
        response.setResult(result);
        return response;
    }
    /**
     * 成功返回
     * @param msg
     * @return
     */
    public static BaseResponse buildFailResponse(String msg) {
        BaseResponse response = new BaseResponse();
        response.setCode(BaseController.ON_OK_STATUS);
        response.setMsg(msg);
        return response;
    }
    /**
     * 成功返回
     * @param msg
     * @return
     */
    public static BaseResponse buildFailResponse(String msg,Object result) {
        BaseResponse response = new BaseResponse();
        response.setCode(BaseController.ON_OK_STATUS);
        response.setMsg(msg);
        response.setResult(result);
        return response;
    }

    /**
     * 通用返回
     * @param code
     * @param msg
     * @param result
     * @return
     */
    public static BaseResponse buildResponse(String code,String msg,Object result){
        BaseResponse response = new BaseResponse();
        response.setCode(code);
        response.setMsg(msg);
        response.setResult(result);
        return response;
    }

}


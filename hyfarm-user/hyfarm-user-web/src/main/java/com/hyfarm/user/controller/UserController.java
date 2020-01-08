package com.hyfarm.user.controller;

import com.hyfarm.base.controller.BaseController;
import com.hyfarm.base.domain.BaseResponse;
import com.hyfarm.service.user.UserService;
import com.hyfarm.user.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController extends BaseController {
    @Autowired
    private UserService userService;

    @RequestMapping("/adduser")
    public BaseResponse addUser(@RequestBody UserEntity user){
        try{
            userService.addUser(user);
            return buildSuccessResponse("添加成功");
        }catch (Exception e){
            e.printStackTrace();
            return buildFailResponse("添加失败，系统异常:【"+e.getMessage()+"】");
        }
    }


}

package com.hyfarm.service.user.impl;

import com.hyfarm.common.IDGenService;
import com.hyfarm.common.IdGenerate;
import com.hyfarm.mapper.user.UserMapper;
import com.hyfarm.service.user.UserService;
import com.hyfarm.user.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(UserEntity user) {
        user.setUserId(IdGenerate.uuid());
        user.setDelFlag("0");
        user.setUserCode(IdGenerate.getCode(user.getUserType()));
       //userMapper.addUser(user);
    }
}

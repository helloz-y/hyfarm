package com.hyfarm.mapper.user;

import com.hyfarm.user.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    void addUser(UserEntity user);
}

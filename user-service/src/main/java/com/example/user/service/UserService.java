package com.example.user.service;

import com.example.user.mapper.UserMapper;
import com.example.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 根据主键查询用户
     * @param id
     * @return
     */
    public User queryById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }
}

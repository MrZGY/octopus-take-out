package com.zgy.octopus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zgy.octopus.entity.User;
import com.zgy.octopus.mapper.UserMapper;
import com.zgy.octopus.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService{
}

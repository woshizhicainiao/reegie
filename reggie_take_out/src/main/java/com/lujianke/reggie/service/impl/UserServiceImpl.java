package com.lujianke.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lujianke.reggie.entity.User;
import com.lujianke.reggie.mapper.UserMapper;
import com.lujianke.reggie.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService{
}

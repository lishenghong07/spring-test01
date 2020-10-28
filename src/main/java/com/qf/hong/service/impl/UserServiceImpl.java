package com.qf.hong.service.impl;

import com.qf.hong.service.UserService;
import org.springframework.stereotype.Service;

@Service//给服务层进行注解的注解
public class UserServiceImpl implements UserService {
    @Override
    public int save() {
        System.out.println("保存的方法被调用了");
        return 0;
    }
}

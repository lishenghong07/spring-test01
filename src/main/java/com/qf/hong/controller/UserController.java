package com.qf.hong.controller;

import com.qf.hong.service.UserService;
import com.qf.hong.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller//给控制层进行注解的注解
public class UserController {

    @Autowired//用于引入其他容器中的对象
    //@Qualifier
   //@Resource(name ="userService" ,type = UserServiceImpl.class)
    public UserService userService;

  /*  构造方法进行对象的引入
  public UserController(UserService userService) {
        this.userService = userService;
    }

    或者

    public void setUserController(UserService userService) {
        this.userService = userService;
    }

*/

    public void toSay(){
        int save = userService.save();
    }
}

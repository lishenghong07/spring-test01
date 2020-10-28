package com.qf.hong.config;

import com.qf.hong.bean.Address;
import com.qf.hong.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//注册类的第三种方式
@Configuration//该注解使用在类上，在类定义方法的时候，必须是Public声明的，必须有返回对象，容器中返回的是你的方法名称
public class DruidConfig {
    //该注解使用在方法上
    @Bean
    public DruidConfig dataSource(){
        return new DruidConfig();
    }

    @Bean
    public User user(Address address){
        User user = new User();
        user.setUsername("qwe");
        user.setAddress(address);
        return user;
    }

    @Bean
    public Address address(){
        return new Address();
    }
}

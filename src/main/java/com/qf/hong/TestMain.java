package com.qf.hong;

import com.qf.hong.bean.Product;
import com.qf.hong.bean.User;
import com.qf.hong.controller.UserController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {

        /*使用的是xml的方式进行注册*/
        //首先指定xml路径
        String path="classpath:spring-context.xml";
        //获取到容器
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext(path);
/*        //通过获取到容器的对象去获取bean创建的对象
        User user = applicationContext.getBean("user", User.class);
        //输出对象
        System.out.println(user.toString());
        applicationContext.close();*/

        /*使用的是注解的方式进行注册*//*
        Product product = applicationContext.getBean("product", Product.class);
        System.out.println(product.toString());
*/
        UserController userController = applicationContext.getBean("userController", UserController.class);
        userController.toSay();
        System.out.println(userController);


    }
}

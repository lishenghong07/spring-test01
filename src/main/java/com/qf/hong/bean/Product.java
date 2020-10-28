package com.qf.hong.bean;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/*
@Getter//获取的注解
@Setter//设置的注解
@ToString//打印的注解
*/
@Component("product")//往容器中注册对象
@Data//各种基本的方法的集合注解
public class Product {
    private String name;
    private BigDecimal bigDecimal;
}

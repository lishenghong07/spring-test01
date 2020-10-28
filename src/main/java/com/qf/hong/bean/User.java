package com.qf.hong.bean;

import java.util.List;
import java.util.Map;

public class User {
    private String username;
    private String password;

/*    //构造方法
    public User(String username,String password) {
        this.username=username;
        this.password=password;
    }*/

    //引用另一个实体类
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    //设置list集合的属性
    private List<Integer> list;

    //设置map集合的属性
    private Map<String,String> map;

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    //设置一个初始化的方法
    public void init(){
        this.username="huahua";
        System.out.println("初始化方法被调用啦！");
    }

    //设置一个销毁的方法
    public void destory(){
        this.username=null;
        System.out.println("销毁的方法被调用啦！");
    }

  public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address=" + address +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}

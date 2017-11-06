package com.shsxt.service;

import com.shsxt.dao.UserDao;

public class UserService {
    private UserDao userDao = new UserDao();

    public void save(String name,String pwd){
        userDao.save(name,pwd);
        System.out.println(name+"=serivce="+pwd);
    }
}

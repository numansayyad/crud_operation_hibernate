package com.main.service;

import com.main.dao.Dao;
import com.main.entity.User;

public class Service {
    Dao maindao=new Dao();
    public String saveuser(User obj){
      String msg=  maindao.saveuser(obj);
        return msg;
    }
}

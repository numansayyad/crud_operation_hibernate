package com.main.controller;

import com.main.entity.User;
import com.main.service.Service;

public class Controller {
    Service mainservice = new Service();
    public String saveuser(User obj){

      String msg=  mainservice.saveuser(obj);
        return msg;
    }

    public String updateuser(User obj){
    String msg=  mainservice.updateuser(obj);
    return msg;
    }
}

package com.main.main;

import com.main.controller.Controller;
import com.main.entity.User;

public class Main {

    public static void main(String[] args) {
        
    
    Controller maincontroller=new Controller();

    User ur=new User(1, "numan_sayyad", "numan@gmail.com", "numan@7688");
    System.out.println(ur.getId());       // Correct getter
System.out.println(ur.getUsername()); // Another getter
System.out.println(ur.getEmail());
System.out.println(ur.getPassword());

String msg=maincontroller.saveuser(ur);
System.out.println(msg);


    }

    

}

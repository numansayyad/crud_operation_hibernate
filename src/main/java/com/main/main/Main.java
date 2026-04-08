package com.main.main;

import java.util.Scanner;

import com.main.controller.Controller;
import com.main.entity.User;

public class Main {

    public static void main(String[] args) {
        Controller maincontroller = new Controller();


        while (true) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter your choice :");
           int choice= sc.nextInt();
            System.out.println("1.save the user");
            System.out.println("2.exit");
            System.out.println("3.Update User");

            if (choice == 1) {
            
                System.out.println("enter your id");
                int id =sc.nextInt();
                sc.nextLine(); // consume leftover newline
                System.out.println("Enter your username:");
                String username=sc.nextLine();
                System.out.println("enter your email id");
                String email=sc.nextLine();
                System.out.println("enter your password");
                String password=sc.nextLine();
                User ur = new User(id, username, email, password);
                System.out.println(ur.getId()); // Correct getter
                System.out.println(ur.getUsername()); // Another getter
                System.out.println(ur.getEmail());
                System.out.println(ur.getPassword());
                String msg = maincontroller.saveuser(ur);
                System.out.println(msg);
                break;
            } else if (choice == 2) {
                System.out.println("thank you ");
                break;
            }
            else if(choice == 3){
                System.out.println("Enter the id you want to update ");
                int id=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter username you want to update ");
                String username=sc.nextLine();
                System.out.println("Enter Email you want to update ");
                String email=sc.nextLine();
                System.out.println("enter password you want to update");
                String password=sc.nextLine();
                User s2 = new User(id, username, email, password);
                String msg= maincontroller.updateuser(s2);
                System.out.println(msg);
                break;

            }
            
            else {
                System.out.println("invalid choice");
            }
            sc.close();
        }

    }

}

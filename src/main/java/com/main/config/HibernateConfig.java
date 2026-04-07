package com.main.config;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class HibernateConfig {
    
   public  static SessionFactory   getSessionFactory(){
     Configuration con= new Configuration();
     con.configure();
  SessionFactory  sf= con.buildSessionFactory();
    return sf;
    }

}

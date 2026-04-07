package com.main.dao;

import com.main.config.HibernateConfig;
import com.main.entity.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Dao {
    SessionFactory ss = HibernateConfig.getSessionFactory();

    public String saveuser(User obj) {

        Session session = ss.openSession(); // clear naming
        Transaction tr = session.beginTransaction();
        session.save(obj); // save on Session
        tr.commit();
        session.close();

        return "insert data successfully";

    }

}

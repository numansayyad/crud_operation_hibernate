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
  public String updateuser(User obj) {
    Session session = ss.openSession();
    Transaction tr = session.beginTransaction();

    User data = session.get(User.class, obj.getId());
    if (data != null) {
        data.setUsername(obj.getUsername());
        data.setEmail(obj.getEmail());
        data.setPassword(obj.getPassword());
    }

    tr.commit();
    session.close();
    return "update user successfully";
}


}

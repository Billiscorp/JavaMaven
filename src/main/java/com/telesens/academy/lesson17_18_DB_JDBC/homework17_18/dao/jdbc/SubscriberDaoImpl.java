package com.telesens.academy.lesson17_18_DB_JDBC.homework17_18.dao.jdbc;

import com.telesens.academy.lesson17_18_DB_JDBC.homework17_18.dao.SubscriberDao;
import com.telesens.academy.lesson17_18_DB_JDBC.homework17_18.model.Subscriber;

import java.util.List;

public class SubscriberDaoImpl implements SubscriberDao {
    @Override
    public boolean save(Subscriber subscriber) {
        return false;
    }

    @Override
    public boolean remove(Subscriber subscriber) {
        return false;
    }

    @Override
    public List<Subscriber> getAll() {
        return null;
    }

    @Override
    public Subscriber findById(long id) {
        return null;
    }
}

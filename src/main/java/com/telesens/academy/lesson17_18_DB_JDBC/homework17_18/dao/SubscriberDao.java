package com.telesens.academy.lesson17_18_DB_JDBC.homework17_18.dao;

import com.telesens.academy.lesson17_18_DB_JDBC.homework17_18.model.Subscriber;

import java.util.List;

public interface SubscriberDao {

    boolean save(Subscriber subscriber);
    boolean remove(Subscriber subscriber);
	List<Subscriber> getAll();
	Subscriber findById(long id);
}

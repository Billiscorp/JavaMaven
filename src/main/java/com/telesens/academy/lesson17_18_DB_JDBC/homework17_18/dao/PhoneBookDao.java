package com.telesens.academy.lesson17_18_DB_JDBC.homework17_18.dao;

import com.telesens.academy.lesson17_18_DB_JDBC.homework17_18.model.PhoneBookRecord;

import java.util.List;

public interface PhoneBookDao {

    boolean save(PhoneBookRecord record);
    boolean remove(PhoneBookRecord record);
	List<PhoneBookRecord> getAll();
	PhoneBookRecord findByKeys(String phoneNumber, Long operatorId);

}

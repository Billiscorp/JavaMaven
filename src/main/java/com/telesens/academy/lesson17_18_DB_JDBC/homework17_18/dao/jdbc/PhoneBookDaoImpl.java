package com.telesens.academy.lesson17_18_DB_JDBC.homework17_18.dao.jdbc;

import com.telesens.academy.lesson17_18_DB_JDBC.homework17_18.dao.PhoneBookDao;
import com.telesens.academy.lesson17_18_DB_JDBC.homework17_18.model.PhoneBookRecord;

import java.util.List;

public class PhoneBookDaoImpl implements PhoneBookDao {
    @Override
    public boolean save(PhoneBookRecord record) {
        return false;
    }

    @Override
    public boolean remove(PhoneBookRecord record) {
        return false;
    }

    @Override
    public List<PhoneBookRecord> getAll() {
        return null;
    }

    @Override
    public PhoneBookRecord findByKeys(String phoneNumber, Long operatorId) {
        return null;
    }
}

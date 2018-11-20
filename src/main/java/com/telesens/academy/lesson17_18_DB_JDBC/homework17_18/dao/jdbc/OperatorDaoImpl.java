package com.telesens.academy.lesson17_18_DB_JDBC.homework17_18.dao.jdbc;

import com.telesens.academy.lesson17_18_DB_JDBC.homework17_18.dao.OperatorDao;
import com.telesens.academy.lesson17_18_DB_JDBC.homework17_18.model.Operator;

import java.util.List;

public class OperatorDaoImpl implements OperatorDao {
    @Override
    public boolean save(Operator operator) {
        return false;
    }

    @Override
    public boolean remove(Operator operator) {
        return false;
    }

    @Override
    public List<Operator> getAll() {
        return null;
    }

    @Override
    public Operator findById(long id) {
        return null;
    }
}

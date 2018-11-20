package com.telesens.academy.lesson17_18_DB_JDBC.homework17_18.dao;

import com.telesens.academy.lesson17_18_DB_JDBC.homework17_18.model.Operator;

import java.util.List;

public interface OperatorDao {

    boolean save(Operator operator);
    boolean remove(Operator operator);
	List<Operator> getAll();
	Operator findById(long id);




}

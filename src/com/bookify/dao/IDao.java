package com.bookify.dao;

import java.util.List;

public interface IDao<T> {
    T create(T t) throws Exception;
    boolean update(int id, T t) throws Exception;
    boolean delete(int id) throws Exception;
    T findOne(int id) throws Exception;
    List<T> findAll() throws Exception;
}

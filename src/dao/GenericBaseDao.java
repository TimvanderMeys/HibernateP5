package dao;

import java.util.List;

public interface GenericBaseDao<T> {
    T findById(int id);

    void update(T entity);

    void delete(T entity);

    void insert(T entity);
}

package dao;

import java.util.Collection;

public interface GenericDao<ID, T> {
    Collection<T> getAll();

    T getInfo(ID id);

    void create(ID id, T t);

    void update(ID id, T t);

    void delete(ID id);
}

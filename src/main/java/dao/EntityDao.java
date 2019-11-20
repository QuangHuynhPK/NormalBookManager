package dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EntityDao<ID, T> implements GenericDao<ID, T> {
    private Map<ID, T> m_entityDao;

    public EntityDao() {
        this.m_entityDao = new HashMap<ID, T>();
    }

    @Override
    public Collection<T> getAll() {
        Collection<T> entryList = this.m_entityDao.values();
        return entryList;
    }

    @Override
    public T getInfo(ID id) {
        return (T) this.m_entityDao.get(id);
    }

    @Override
    public void create(ID id, T t) {
        this.m_entityDao.put(id, t);
    }

    @Override
    public void update(ID id, T t) {
        this.m_entityDao.put(id, t);
    }

    @Override
    public void delete(ID id) {
        this.m_entityDao.remove(id);
    }
}

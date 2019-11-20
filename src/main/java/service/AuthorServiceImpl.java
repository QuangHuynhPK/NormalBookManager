package service;

import dao.AuthorDaoImpl;
import model.Author;

import java.util.Collection;

public class AuthorServiceImpl implements AuthorService {
    private AuthorDaoImpl m_authorDaoImpl;
    public AuthorServiceImpl() {
        this.m_authorDaoImpl = new AuthorDaoImpl();
    }
    @Override
    public Collection<Author> getAll() {
        return this.m_authorDaoImpl.getAll();
    }

    @Override
    public Author getInfo(Integer integer) {
        return this.m_authorDaoImpl.getInfo(integer);
    }

    @Override
    public void create(Integer integer, Author author) {
        this.m_authorDaoImpl.create(integer, author);
    }

    @Override
    public void update(Integer integer, Author author) {
        this.m_authorDaoImpl.update(integer, author);
    }

    @Override
    public void delete(Integer integer) {
        this.m_authorDaoImpl.delete(integer);
    }
}

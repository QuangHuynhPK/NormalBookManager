package dao;

import model.Author;

public class AuthorDaoImpl extends EntityDao<Integer, Author> implements GenericDao<Integer, Author> {
    public AuthorDaoImpl() {
        super();
    }
}

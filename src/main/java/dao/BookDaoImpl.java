package dao;

import model.Book;

public class BookDaoImpl extends EntityDao<Integer, Book> implements GenericDao<Integer, Book> {
    public BookDaoImpl() {
        super();
    }
}

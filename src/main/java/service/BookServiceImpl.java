package service;

import dao.BookDaoImpl;
import model.Book;

import java.util.Collection;

public class BookServiceImpl implements BookService {
    private BookDaoImpl m_bookDaoImpl;
    public BookServiceImpl() {
        this.m_bookDaoImpl = new BookDaoImpl();
    }
    @Override
    public Collection<Book> getAll() {
        return this.m_bookDaoImpl.getAll();
    }

    @Override
    public Book getInfo(Integer integer) {
        return this.m_bookDaoImpl.getInfo(integer);
    }

    @Override
    public void create(Integer integer, Book book) {
        this.m_bookDaoImpl.create(integer, book);
    }

    @Override
    public void update(Integer integer, Book book) {
        this.m_bookDaoImpl.update(integer, book);
    }

    @Override
    public void delete(Integer integer) {
        this.m_bookDaoImpl.delete(integer);
    }
}

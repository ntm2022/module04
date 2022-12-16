package com.cg.thbook.service;

import com.cg.thbook.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();

    void save(Book book);

    Book findById(int id);

    void update(int id, Book book);

    void remove(int id);
}

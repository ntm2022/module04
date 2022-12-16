package com.cg.thbook.service;

import com.cg.thbook.model.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookService implements IBookService {
    private static final Map<Integer, Book> books;

    static {

        books = new HashMap<>();
        books.put(1, new Book(1, "So1", "john", 3.0));
        books.put(2, new Book(2, "So2", "bill", 5.5));
        books.put(3, new Book(3, "So3", "alex", 6.0));
        books.put(4, new Book(4, "So4", "adam", 2.0));
        books.put(5, new Book(5, "So5", "sophia", 3.0));
        books.put(6, new Book(6, "So11", "rose", 5.0));
    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(books.values());
    }

    @Override
    public void save(Book book) {
        books.put(book.getId(), book);
    }

    @Override
    public Book findById(int id) {
        return books.get(id);
    }

    @Override
    public void update(int id, Book book) {
        books.put(id, book);

    }

    @Override
    public void remove(int id) {
        books.remove(id);
    }

}

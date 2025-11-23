package service;

import model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public interface BookService {
    public void addBook(Book book);
    public Book getBookById(String id);
    public List<Book> getAllBooksByCategory(String Category);
    public boolean deleteBookById(String id);
    public List<Book> getAllBooks ();
    public double calculateTotalValue();
}

package service.impl;

import constant.Constant;
import model.Book;
import model.Novel;
import model.TextBook;
import service.BookService;
import validation.BookValidation;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookServiceImpl implements BookService {
    List<Book> books= new ArrayList<>();
    BookValidation bookValidation = new BookValidation();


    @Override
    public void addBook(Book book) {
        if(bookValidation.isValid(book)){
            books.add(book);
            System.out.println(Constant.SuccessMessage.ADD_BOOK_SUCCESSFUL);
        }
    }

    @Override
    public Book getBookById(String id) {
        for(Book x: books){
            if(x.getId().equals(id)){
                return x;
            }
        }
        System.out.println(Constant.InvalidMessage.ID_INVALID);
        return null;
    }


    @Override
    public List<Book> getAllBooksByCategory(String Category) {
        List<Book> res = new ArrayList<>();
        if(Category.equalsIgnoreCase("Novel")){
            for(Book x: books){
                if(x instanceof Novel){
                    res.add(x);
                }
            }
        }
        if(Category.equalsIgnoreCase("Textbook")){
            for(Book x: books){
                if(x instanceof TextBook){
                    res.add(x);
                }
            }
        }
        if(res.isEmpty()){
            System.out.println(Constant.ErrorMessage.NO_BOOK);
            return null;
        }
        return res;
    }

    @Override
    public boolean deleteBookById(String id) {
        for(Book x: books){
            if(x.getId().equals(id)){
                books.remove(x);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }

    @Override
    public double calculateTotalValue() {
        double sum = 0;
        for(Book x: books){
            sum+=x.getPrice()*x.getQuantity();
        }
        return sum;
    }
}

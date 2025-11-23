import constant.Constant;
import model.Book;
import model.Novel;
import model.TextBook;
import service.BookService;
import service.impl.BookServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        Scanner sc = new Scanner(System.in);
        Book a = new Book("Viet Doanh","Noi nay co anh",100,10);
        Novel b = new Novel("Hoang","Bay bong",120,4,"Kinh di");
        TextBook c = new TextBook("Khanh","May bay",150,4,"Phieu luu");
        bookService.addBook(a);
        bookService.addBook(b);
        bookService.addBook(c);
        System.out.println(Constant.MenuMessage.MENU);
        System.out.print(Constant.MenuMessage.CHOICE);
        int choice = sc.nextInt();sc.nextLine();

        switch (choice){
            case 1:
                System.out.print(Constant.InputMessage.INPUT_TITLE);
                String title = sc.nextLine();
                System.out.print(Constant.InputMessage.INPUT_AUTHOR);
                String author = sc.nextLine();
                System.out.print(Constant.InputMessage.INPUT_PRICE);
                double price = sc.nextDouble();
                System.out.print(Constant.InputMessage.INPUT_QUANTITY);
                int quantity = sc.nextInt();sc.nextLine();
                Book book = new Book(author,title,price,quantity);
                bookService.addBook(book);
                break;
            case 2:
                System.out.print(Constant.InputMessage.INPUT_ID);
                String id = sc.nextLine();
                Book book1 = bookService.getBookById(id);
                if(book1!=null){
                    book1.displayInfo();
                }
                break;
            case 3:
                System.out.print(Constant.InputMessage.INPUT_CATEGORY);
                String category = sc.nextLine();
                List<Book> booksCategory = bookService.getAllBooksByCategory(category);
                if(booksCategory!=null){
                    for(Book x: booksCategory){
                        x.displayInfo();
                    }
                }
                break;
            case 4:
                List<Book> books = bookService.getAllBooks();
                for(Book x: books){
                    x.displayInfo();
                }
                break;
            case 5:
                System.out.println(Constant.InputMessage.INPUT_ID);
                String id1 = sc.nextLine();
                if(bookService.deleteBookById(id1)){
                    System.out.println(Constant.SuccessMessage.DELETE_SUCCESSFUL);
                }
                else{
                    System.out.println(Constant.InvalidMessage.ID_INVALID);
                }
                break;
            case 6:
                System.out.print("Total Value: "+bookService.calculateTotalValue());
                break;
            default:
                System.out.println(Constant.ErrorMessage.CHOICE_INCORRECT);
        }
    }
}
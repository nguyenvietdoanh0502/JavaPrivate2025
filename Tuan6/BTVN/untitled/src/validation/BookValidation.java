package validation;

import constant.Constant;
import model.Book;

public class BookValidation {
    public boolean isValid(Book book){
        if(book.getTitle().isEmpty()){
            System.out.println(Constant.InvalidMessage.TITLE_INVALID);
            return false;
        }
        if(book.getAuthor().isEmpty()){
            System.out.println(Constant.InvalidMessage.AUTHOR_INVALID);
            return false;
        }
        if(book.getPrice()<=0){
            System.out.println(Constant.InvalidMessage.PRICE_INVALID);
            return false;
        }
        if(book.getQuantity()<=0){
            System.out.println(Constant.InvalidMessage.QUANTITY_INVALID);
            return false;
        }
        return true;
    }
}

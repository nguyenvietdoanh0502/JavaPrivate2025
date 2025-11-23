package constant;

public class Constant {
    public static class SuccessMessage{
        public final static String BORROW_SUCCESSFUL = "Borrow successful";
        public final static String ADD_BOOK_SUCCESSFUL = "Add book successful";
        public final static String DELETE_SUCCESSFUL = "Delete successful";
    }
    public static class InvalidMessage{
        public final static String ID_INVALID = "Id invalid";
        public final static String TITLE_INVALID = "Title invalid";
        public final static String AUTHOR_INVALID = "Author invalid";
        public final static String PRICE_INVALID = "Price invalid";
        public final static String QUANTITY_INVALID = "Quantity invalid";
        public final static String CATEGORY_INVALID = "Category invalid";
    }
    public static class ErrorMessage{
        public final static String NO_BOOK = "There are no books in this category";
        public final static String CHOICE_INCORRECT = "Your choice is incorrect";
    }
    public static class MenuMessage{
        public final static String MENU = "--- Menu ---\n" +
                "1. Thêm sách\n" +
                "2. Lấy sách theo ID\n" +
                "3. Lấy tất cả sách theo thể loại (TextBook/Novel)\n" +
                "4. Lấy tất cả sách\n" +
                "5. Xóa sách theo ID\n" +
                "6. Tổng giá trị thư viện ";
        public final static String CHOICE = "Enter your choice: ";

    }
    public static class InputMessage{
        public final static String INPUT_TITLE = "Enter title: ";
        public final static String INPUT_AUTHOR = "Enter author: ";
        public final static String INPUT_PRICE = "Enter price: ";
        public final static String INPUT_QUANTITY ="Enter quantity: ";
        public final static String INPUT_ID = "Enter ID: ";
        public final static String INPUT_CATEGORY = "Enter category: ";
        public final static String INPUT_SUBJECT = "Enter subject: ";
        public final static String INPUT_GENRE = "Enter genre: ";
    }
}

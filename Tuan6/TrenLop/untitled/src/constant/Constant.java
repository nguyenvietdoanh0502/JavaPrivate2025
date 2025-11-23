package constant;

public class Constant {
    public static class MenuMessage{
        public final static String MENU = "  --- Menu ---\n" +
                "1. Các con vật có thể bơi\n" +
                "2. Các con vật có thể bay\n" +
                "3. Xóa con vật có thể bơi\n" +
                "4. Xóa con vật vừa có thể bơi vừa có thể bay\n";
        public final static String CHOICE = "Enter your choice: ";
    }
    public static class SuccessMessage{
        public final static String NO_ANIMAL_SWIMMABLE ="All animals can't swim";
        public final static String NO_ANIMAL_FLYABLE = "All animals can't fly";
        public final static String DELETE_SWIMMABLE_SUCCESSFUL = "Delete animal swimmable successful";
        public final static String DELETE_SWIMMABLE_AND_FLYABLE_SUCCESSFUL ="Delete animal swimmable and flyable successful";
    }
    public static class ErrorMessage{
        public final static String CAN_NOT_DELETE = "Don't have any animal able to delete";
        public final static String CHOICE_INVALID = "Your choice is invalid";
    }
}

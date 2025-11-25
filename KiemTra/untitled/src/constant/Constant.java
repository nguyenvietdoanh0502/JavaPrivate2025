package constant;

public class Constant {
    public static class InvalidMessage{
        public final static String INVALID_ID = "ID not exist";
        public final static String INVALID_NAME = "Name not exist";
        public final static String INVALID_CHOICE = "Your choice not exist";
    }
    public static class MenuMessage{
        public final static String MENU = "----- Menu -----\n" +
                "1. In ra danh sách tất cả các nhân viên\n" +
                "2. In ra thông tin nhiên viên theo ID\n" +
                "3. Lọc ra danh sách nhân viên theo Tên \n" +
                "4. Thoát";
        public final static String CHOICE = "Enter your choice: ";
        public final static String OUT ="Out!!!";
    }

    public static class InputMessage{
        public final static String INPUT_ID = "Enter id: ";
        public final static String INPUT_NAME = "Enter name: ";
    }
}

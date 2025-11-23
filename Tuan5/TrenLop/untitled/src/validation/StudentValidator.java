package validation;

import constant.Constant;
import model.Student;

public class StudentValidator {
    public boolean isValid(Student student){
        if(student.getName().isEmpty()){
            System.out.println(Constant.ErrorMessage.NAME_EMPTY);
            return false;
        }
        if(student.getAge()<=0){
            System.out.println(Constant.ErrorMessage.INVALID_AGE);
            return false;
        }
        if(student.getClassRoom().isEmpty()){
            System.out.println(Constant.ErrorMessage.CLASS_EMPTY);
            return false;
        }
        return true;
    }
}

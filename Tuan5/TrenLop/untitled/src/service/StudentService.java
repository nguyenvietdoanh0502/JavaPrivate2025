package service;

import constant.Constant;
import model.Student;
import validation.StudentValidator;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    private ArrayList<Student> students = new ArrayList<>();
    private StudentValidator studentValidator = new StudentValidator();

    public void addStudent(Student student){
        if(studentValidator.isValid(student)){
            students.add(student);
            System.out.println(Constant.SuccessfulMessage.ADD_SUCCESSFUL);
        }
        else{
            return;
        }
    }

    public void removeStudent(Student student){
        if(students.contains(student)){
            students.remove(student);
            System.out.println(Constant.SuccessfulMessage.REMOVE_SUCCESSFUL);
        }
        else{
            System.out.println(Constant.ErrorMessage.INVALID_STUDENT);
            return;
        }
    }

    public Student findByName(String name){
        for(Student x : students){
            if(x.getName().equalsIgnoreCase(name)){
                return x;
            }
        }
        System.out.println(Constant.ErrorMessage.INVALID_NAME);
        return null;
    }
    public ArrayList<Student> findByClass(String classRoom){
        ArrayList<Student> res = new ArrayList<>();
        for(Student x : students){
            if(x.getClassRoom().equalsIgnoreCase(classRoom)){
                res.add(x);
            }
        }
        if(!res.isEmpty()){
            return res;
        }
        System.out.println(Constant.ErrorMessage.INVALID_CLASS);
        return null;
    }
    public void fixStudent(){
        System.out.print("Enter name of student: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for(Student x: students){
            if(x.getName().equalsIgnoreCase(name)){
                System.out.print("Enter new name: ");
                String newName = sc.nextLine();
                x.setName(newName);
                System.out.println("Enter new age: ");
                int newAge = sc.nextInt();sc.nextLine();
                x.setAge(newAge);
                System.out.println("Enter new class: ");
                String newClass = sc.nextLine();
                x.setClassRoom(newClass);
                System.out.println(Constant.SuccessfulMessage.FIX_SUCCESSFUL);
                return;
            }
        }
        System.out.println(Constant.ErrorMessage.INVALID_NAME);
    }
}

package org.test.prdicate;

import org.test.data.Student;
import org.test.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class StudentPredicateExample {
    public static Predicate<Student> p1 =(student) -> student.getGradeLevel() >=3.5;
    static Predicate<Student> p2 =(student) -> student.getGpa() >=3.9;
    static List<Student> studentList = StudentDataBase.getAllStudents();


    public static void getStudentsByGradeLevel(){
        studentList.forEach(student -> {
            if(p1.and(p2).negate().test(student)){ //Both conditions
                System.out.println(student);
            }
        });
    }
    public static void getStudentsByGpa(){
    //    List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p2.test(student)){
                System.out.println(student);
            }
        });
    }

    public static void main(String[] args) {
        getStudentsByGradeLevel();
        System.out.println();
        getStudentsByGpa();

    }
}

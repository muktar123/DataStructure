package org.test.methodRef;

import org.test.data.Student;
import org.test.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodRef {
   static Consumer<Student> studentConsumer = System.out::println;
    static Consumer<Student> c2 = Student::printAllActivities;
    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(studentConsumer);
       // System.out.println();
        StudentDataBase.getAllStudents().forEach(c2);
        //or
        StudentDataBase.getAllStudents().forEach(Student::printAllActivities);


    }
}

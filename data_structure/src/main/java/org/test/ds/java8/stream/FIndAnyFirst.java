package org.test.stream;

import org.test.data.Student;
import org.test.data.StudentDataBase;

import java.util.Optional;

public class FIndAnyFirst {

    public static Optional<Student> findAnyStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }
    public static Optional<Student> findFirstStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=4.9)
                .findFirst();
    }

    public static void main(String[] args) {
                Optional<Student> optionalStudent = findAnyStudent();
        System.out.println(optionalStudent);

        System.out.println(findFirstStudent());
    }
}

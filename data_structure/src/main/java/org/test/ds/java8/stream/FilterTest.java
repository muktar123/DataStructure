package org.test.stream;

import org.test.data.Student;
import org.test.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class FilterTest {

    public static List<Student> filterStudents(){
        List<Student> studentList= StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender().equals("female"))
                        .collect(Collectors.toList());
        return studentList;
    }
    public static void main(String[] args) {
        filterStudents().forEach(System.out::println);
    }
}

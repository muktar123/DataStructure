package org.test.stream;

import org.test.data.Student;
import org.test.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorTest {
    public static List<Student> getStudentNamesSorted(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

    }
    public static List<Student> getStudentGpaSorted(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        getStudentNamesSorted().forEach(System.out::println);
        System.out.println(getStudentGpaSorted());
    }
}

package org.test.stream;

import org.test.data.Student;
import org.test.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class MinByMaxByExample {

    public static Optional<Student> minByExample() {
        return StudentDataBase.getAllStudents().stream()
                .collect(minBy(Comparator.comparing(Student::getGpa)));
    }
    public static Optional<Student> maxByExample() {
        return StudentDataBase.getAllStudents().stream()
                .collect(maxBy(Comparator.comparing(Student::getGpa)));
    }
     //   return StudentDataBase.getAllStudents().stream()
               // .map(student -> student.getGpa())
               // .reduce((x,y)-> x.getGpa()>y.getGpa()?x:y);
            //    .collect(minBy(Comparator.comparing(Student::getGpa)));

    public static void main(String[] args) {
        System.out.println(maxByExample());
        System.out.println(minByExample());
    }
}

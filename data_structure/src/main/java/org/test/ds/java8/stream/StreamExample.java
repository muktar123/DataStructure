package org.test.stream;

import org.test.data.Student;
import org.test.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {

        List<Student> studsList =StudentDataBase.getAllStudents().stream().collect(Collectors.toList());
        Predicate<Student> studentPredicate =student -> student.getGpa()>=3.0;
        System.out.println(studsList);
        Map<String,List<String>> studsMap =StudentDataBase.getAllStudents().stream()
             //   .filter(student -> student.getGpa()>=3.0).
                .filter(studentPredicate).
                //collect(Collectors.toMap(Student::getName, Student::getActivities));
                collect(Collectors.toMap(student -> student.getName(), student -> student.getActivities()));

        System.out.println(studsMap);
    }
}

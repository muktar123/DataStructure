package org.test.mapAndFlatMapSortCount;

import org.test.data.Student;
import org.test.data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamMapExample {

    public static List<String> nameList(){
       return StudentDataBase.getAllStudents().stream()
               .map(Student::getName)
               .map(String::toUpperCase)
             //  .collect(toList());
                .collect(toList());
    }
    public static Set<String> nameSet(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                //  .collect(toList());
                .collect(toSet());
    }
    public static void main(String[] args) {
        System.out.println(nameList());
        System.out.println(nameSet());
    }
}

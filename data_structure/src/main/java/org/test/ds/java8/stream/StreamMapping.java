package org.test.stream;

import org.test.data.Student;
import org.test.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class StreamMapping {

    public static void main(String[] args) {
       List<String> studentNameList = StudentDataBase.getAllStudents().stream()
               .collect(mapping(Student::getName, toList()));
        System.out.println(studentNameList);
    }
}

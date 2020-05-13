package org.test.stream;

import org.test.data.Student;
import org.test.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamSumAvgExample {

    public static int sum(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.summingInt(Student::getNotebooks));
    }
    public static double avg(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.averagingInt(Student::getNotebooks));
    }
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(avg());
    }
}

package org.test.stream;

import org.test.data.StudentDataBase;

import java.util.stream.Collectors;

public class JoiningExample {
    public static String joining_1(){
        return StudentDataBase.getAllStudents().stream().map(student-> student.getName()) //Stream<String>
                .collect(Collectors.joining()); //Joining Concatinate all the Strings
    }
    public static String joining_2(){
        return StudentDataBase.getAllStudents().stream().map(student-> student.getName()) //Stream<String>
                .collect(Collectors.joining(", ")); //Joining Concatinate all the Strings
    }
    public static String joining_3(){
        return StudentDataBase.getAllStudents().stream().map(student-> student.getName()) //Stream<String>
                .collect(Collectors.joining(", ","(",")"));
                                        //Joining Concatinate all the Strings
    }

    public static void main(String[] args) {
        System.out.println(joining_1());
        System.out.println(joining_2());
        System.out.println(joining_3());
    }
}

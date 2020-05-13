package org.test.stream;

import org.test.data.StudentDataBase;

public class MatchExample {

    public static boolean allMatches(){
        return StudentDataBase.getAllStudents().stream()//stream contains all the students.
        .allMatch(student -> student.getGpa()>=3.9);// returns true if all students have GPA >=3.5

    }
    public static boolean anyMatches(){
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa()>=3.5);
    }

    public static boolean noneMatches(){
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa()>=4.5);
    }
    public static void main(String[] args) {
        System.out.println(allMatches());
        System.out.println(anyMatches());
        System.out.println(noneMatches());


    }
}

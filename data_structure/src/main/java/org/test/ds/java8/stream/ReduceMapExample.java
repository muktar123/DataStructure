package org.test.stream;

import org.test.data.Student;
import org.test.data.StudentDataBase;

public class ReduceMapExample {

    private static int totalNotebooks(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getNotebooks)
               // .reduce(0, (a,b)-> a+b);
                  .reduce(0, Integer::sum);
    }
    public static void main(String[] args) {
        System.out.println(totalNotebooks());

    }
}

package org.test.stream.mapAndFlatMapSortCount;

import org.test.data.Student;
import org.test.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMap {


    public static List<String> printStudentActivities(){
       return StudentDataBase.getAllStudents().stream().map(Student::getActivities)
               .flatMap(List::stream).distinct().sorted()
                .collect(Collectors.toList());
    }

    public static Long getCountOfActivities(){
        return StudentDataBase.getAllStudents().stream().map(Student::getActivities)
                .flatMap(List::stream).sorted()
                .count();
    }
    public static void main(String[] args) {
        System.out.println(printStudentActivities());
        System.out.println(getCountOfActivities());
    }
}

package org.test.stream;

import org.test.data.Student;
import org.test.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class GroupByexample {

    public static void groupByGender(){
        //List all the female students
        Map<String, List<Student>> stringListMap =StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGender));//Retruns a Map
       // System.out.println(stringListMap);
        stringListMap.forEach((s, students) -> System.out.println(s+"->"+students));
    }
    public static void customizegroupBy(){
        //List all the female students
        Map<String, List<Student>> stringListMap =StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(student->student.getGpa()>3.8 ?"OUTSTADNING":"AVERAGE"));//Retruns a Map
        stringListMap.forEach((s, students) -> System.out.println(s+"->"+students));
    }
    public static void twoWayGrouping(){ //Nested grouping
        Map<Integer, Map<String, List<Student>>> integerMapMap =StudentDataBase.getAllStudents().stream()
        .collect(groupingBy(Student::getGradeLevel,
                groupingBy(student->student.getGpa()>=3.8 ?"OUTSTADNING":"AVERAGE")));
        System.out.println(integerMapMap);
    }

    public static void twoWayGrouping_2(){ //Nested grouping
        Map<String, Integer> integerMapMap =StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getName,
                        summingInt(Student::getNotebooks)));
        System.out.println(integerMapMap);
    }
    public static void calculteTopGpa(){ //Nested grouping
        Map<Integer, Optional<Student>> topGpa =StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        maxBy(Comparator.comparing(Student::getGpa))));
        System.out.println(topGpa);
    }

    public static void main(String[] args) {
       // groupByGender();
        //customizegroupBy();
      //  twoWayGrouping();
     //   twoWayGrouping_2();
        calculteTopGpa();

    }
}

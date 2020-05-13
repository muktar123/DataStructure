package org.test.defaultinterface;

import org.test.data.Student;
import org.test.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class StudentSort {
    static Consumer<Student> studentConsumer = (student -> System.out.println(student));
    static Comparator<Student> studentNameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> studentGradeComparator = Comparator.comparing(Student::getGradeLevel);
    public static void sortByName(List<Student> studentList){
        studentList.sort(studentNameComparator);
        studentList.forEach(studentConsumer);
    }
    public static void sortByGpa(List<Student> studentList){
        System.out.println("After sort");
        Comparator<Student> studentComparator = Comparator.comparingDouble(Student::getGpa);
        studentList.sort(studentComparator);
        studentList.forEach(studentConsumer);
    }
    public static void comparatorChaining(List<Student> studentList){
        System.out.println("After comarator chaining");
        studentList.sort(studentGradeComparator.thenComparing(studentNameComparator));
        studentList.forEach(studentConsumer);
    }
    //If studentList contains null value in the list, it will throw null pointer exception
    public static void sortWithNullValues(List<Student> studentList){
            Comparator<Student> studentComparator = Comparator.nullsFirst(studentNameComparator);
            studentList.sort(studentComparator);
    }
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Before sort");
        studentList.forEach(studentConsumer);
        sortWithNullValues(studentList);
      //  comparatorChaining(studentList);
        //   sortByName(studentList);
       // sortByGpa(studentList);
    }
}

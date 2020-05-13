package org.test.consumer;

import org.test.data.Student;
import org.test.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
    static Consumer<Student> c1 = (student) -> System.out.println(student);
    static Consumer<Student> c2 = (student) -> System.out.print(student.getName());
    static Consumer<Student> c3 = (student) -> System.out.println(student.getActivities());

    public static void getStudentDetails() {
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(c1);
    }

    public static void getNamesAndActivities() {
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(c2.andThen(c3));
    }

    public static void getNamesAndActivitiesWithConditions() {
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach((student) -> {
            if(student.getGradeLevel()>=3){
                c2.andThen(c3).accept(student);
            }
        });
    }

    public static void main(String[] args) {

        Consumer<String> consumer = (a) -> System.out.println(a.toUpperCase());
        System.out.println();
        consumer.accept("Ali");
      //  getStudentDetails();
        getNamesAndActivities();
        System.out.println();
        getNamesAndActivitiesWithConditions();
    }
}

package org.test.consumer;

import org.test.data.Student;
import org.test.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerTes {

    public static void nameAndActivities(){
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
            System.out.println("Name: " + name);
            System.out.println("Activities: " + activities);
        };
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
    }
    public static void main(String[] args) {
        nameAndActivities();
        BiConsumer<String, String> biConsumer = (a,b) -> {
            System.out.println("a : "+a+ " b : "+b);
        };
        biConsumer.accept("Ali", "Mukhtar");

        BiConsumer<Integer, Integer> biConsumer1 = (a, b) -> {
            System.out.println("Multiplication : "+ (a*b));
        };

        BiConsumer<Integer, Integer> biConsumer2 = (a, b) -> {
            System.out.println("Division : "+ (a/b));
        };
        biConsumer1.andThen(biConsumer2).accept(10,5);

    }
}

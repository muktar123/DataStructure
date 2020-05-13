package org.test.prdicate;

import org.test.data.Student;
import org.test.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumer {
    Predicate<Student> studentPredicate = (student) -> student.getGradeLevel() >=3.5;
    Predicate<Student> studentPredicate1 = (student) -> student.getGpa() >=3.9;
    BiConsumer<String, List<String>> stringListBiConsumer =(name, activities) -> System.out.println(name+" "+activities);

    Consumer<Student> studentConsumer = (student -> {
        if(studentPredicate.and(studentPredicate1).test(student)){
            stringListBiConsumer.accept(student.getName(), student.getActivities());
        }
    });

    public void getNameAndActivities(List<Student> students){
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new PredicateAndConsumer().getNameAndActivities(studentList);

    }
}

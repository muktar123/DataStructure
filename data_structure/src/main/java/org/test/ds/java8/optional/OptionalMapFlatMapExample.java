package org.test.optional;

import org.test.data.Student;
import org.test.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {
    public static void optionalFilter(){     //filter
        Optional<Student> optionalStudent =Optional.ofNullable(StudentDataBase.studentSupplier.get());
      // Optional<Student> optionalStudent =Optional.ofNullable(null);
        optionalStudent.filter(student -> student.getGpa()>=3.5)
                .ifPresent(student -> System.out.println(student));
    }
    public static void optionalMap(){ //Map
        Optional<Student> optionalStudent =Optional.ofNullable(StudentDataBase.studentSupplier.get());
        optionalStudent.filter(student -> student.getGpa()>=3.5)
                .map(Student::getName).ifPresent(s -> System.out.println(s));
    }
    public static void optionalFlatMap(){     //FlatMap, If an optional object is present inside
        //another optional object then use FlatMap, Bike is optional object present inside optionalStudent
        Optional<Student> optionalStudent =Optional.ofNullable(StudentDataBase.studentSupplier.get());
        // Optional<Student> optionalStudent =Optional.ofNullable(null);
        optionalStudent.filter(student -> student.getGpa()>=3.5)//Optional<Student Optional<Bike>>
                .flatMap(Student::getBike) //Optional<Bike>
                .map(Bike::getName) //String Bike
                .ifPresent(student -> System.out.println(student));
    }
    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}

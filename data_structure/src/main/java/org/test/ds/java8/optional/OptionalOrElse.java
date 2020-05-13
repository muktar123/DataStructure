package org.test.optional;

import org.test.data.Student;
import org.test.data.StudentDataBase;
import java.util.Optional;

public class OptionalOrElse {
    public static String optionalOrElse(){     //OrElse
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
      //  Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElse("Default");
        return name;
    }
    public static String optionalOrElseGet(){     //OrElseGet
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        //  Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElseGet(()->"Default");
        //orElseGet takes a supplier
        return name;
    }
    public static String optionalOrElseThrow() {     //OrElseThrow
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        String name = studentOptional.map(Student::getName)
                .orElseThrow(()->new RuntimeException("No data available"));
        //orElseThrow takes a supplier and throw an exception
        return name;
    }
    public static void main(String[] args) {
        System.out.println(optionalOrElse());
        System.out.println(optionalOrElseGet());
        System.out.println(optionalOrElseThrow());

    }
}

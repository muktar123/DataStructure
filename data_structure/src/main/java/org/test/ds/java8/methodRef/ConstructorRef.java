package org.test.methodRef;

import org.test.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorRef {

    static Supplier<Student> stringSupplier = Student::new;
    static Function<String, Student> stringStudentFunction = Student::new;

    public static void main(String[] args) {
        System.out.println(stringSupplier.get());
        System.out.println(stringStudentFunction.apply("Ali"));

    }
}

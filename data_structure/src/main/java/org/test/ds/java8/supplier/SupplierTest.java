package org.test.supplier;

import org.test.data.Student;
import org.test.data.StudentDataBase;

import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {

    static Supplier<String> stringSupplier = () ->  "hi";

    static Supplier<List<Student>> studentSupplier = () -> StudentDataBase.getAllStudents();

    public static void main(String[] args) {
        System.out.println(stringSupplier.get());
        System.out.println(studentSupplier.get());
    }
}

package org.test.stream;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class OfGenerateIterateStreamExample {
    public static void main(String[] args) {
        Stream<String> stringStream =Stream.of("Ali", "Jammy", "Aashna");
        stringStream.forEach(System.out::print);

        Stream.of("Ali", "Jammy", "Aashna").forEach(System.out::println);
        Stream.iterate(1,x->x*2).limit(30).forEach(System.out::println);

        //Generate method takes a supplier
        Supplier<Integer> integerSupplier = ()-> new Random().nextInt();
        Stream.generate(integerSupplier).limit(5).forEach(System.out::println);

    }
}

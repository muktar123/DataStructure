package org.test.stream;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LimitSkipExample {
    public static int findLimit(List<Integer> integers) {
        return integers.stream()
                .limit(2)
                .reduce(0, (a, b) -> a + b);
    }
    public static Optional<Integer> findLimitWithOptional(List<Integer> integers) {
        return integers.stream()
                .limit(2) //Only accept first two values i.e 6 and 7
                .reduce ((a, b) -> a + b);
    }
    public static Optional<Integer> skip(List<Integer> integers) {
        return integers.stream()
                .skip(2) //It accepts values after first two parameters //80,9,10
                .reduce ((a, b) -> a + b);
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6, 7, 80, 9, 10);
     //   System.out.println(findLimit(integerList));
        Optional<Integer> optionalInteger = findLimitWithOptional(integerList);
        if(optionalInteger.isPresent())
            System.out.println(optionalInteger.get());
        Optional<Integer> skipInteger = skip(integerList);
        if(skipInteger.isPresent())
            System.out.println(skipInteger.get());


    }
}

package org.test.numericStream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {
    public static void main(String[] args) {
        //Sum
        int sum = IntStream.rangeClosed(1,50).sum();
        System.out.println(sum);
        //Max Value
      //  OptionalInt max = IntStream.rangeClosed(0,0).max();
        OptionalInt max = IntStream.rangeClosed(1,50).max();
        System.out.println("Max : "+max.getAsInt());
        System.out.println(max.isPresent()?max.getAsInt():0);
        //Min Value
        OptionalLong longStream = LongStream.rangeClosed(50,100).min();//Min method takes only OptionalLong
        System.out.print("Long value is ");
        System.out.print(longStream.isPresent()?longStream.getAsLong():0);
        //Average Value
        System.out.println();
        OptionalDouble optionalDouble =IntStream.rangeClosed(1,50).average();
        System.out.print("Average of numbers is ");
        System.out.print(optionalDouble.isPresent()? optionalDouble.getAsDouble():0);
    }
}

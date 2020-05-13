package org.test.numericStream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {


    public static void main(String[] args) {
        //IntRangeClosed
        IntStream intStream = IntStream.rangeClosed(1, 50);
        System.out.println(intStream.count());
        System.out.println("Int RangeClosed");
        IntStream.rangeClosed(1,50).forEach(x-> System.out.print(x+","));
        //IntRange
        System.out.println();
        IntStream intStream1 = IntStream.range(1, 50);
        System.out.println(intStream1.count());
        System.out.println("Int range");
        IntStream.range(1,50).forEach(x-> System.out.print(x+","));
        //LongRange
        System.out.println();
        LongStream longStream = LongStream.rangeClosed(1, 50);
        System.out.println(longStream.count());
        System.out.println("Long Range");
        LongStream.range(1,50).forEach(x-> System.out.print(x+","));
        System.out.println();
        //Convert intStream to DoubleStream or LongStream
        System.out.println("As DOuble Range CLosed");
        IntStream.rangeClosed(1,50).asDoubleStream().forEach(x-> System.out.print(x+","));
      //  IntStream.rangeClosed(1,50).asLongStream().forEach(x-> System.out.print(x));
        DoubleStream.of(1,2,3,4).forEach(x->System.out.println(x));
    }
}

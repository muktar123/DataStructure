package org.test.lambda;

import java.util.Comparator;
import java.util.jar.JarOutputStream;

public class ComparatorLambda {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("comparing numbers: "+ comparator.compare(5,5));

        Comparator<Integer> comparator1 =(Integer a, Integer b) -> a.compareTo(b);
        System.out.println(comparator1.compare(6,5));

        Comparator<Integer> comparator2 =( a,  b) -> a.compareTo(b);
        System.out.println(comparator2.compare(6,5));


    }
}

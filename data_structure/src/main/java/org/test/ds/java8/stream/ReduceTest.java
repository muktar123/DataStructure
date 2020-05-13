package org.test.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceTest {

    public static int performMultiplication(List<Integer> integerList){
        return integerList.stream().reduce(1, (a,b)->a*b);//1st parameter is default value and
        //2nd parameter is BinaryOperator take two parameters and return same data type
    }
    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList){
        return integerList.stream().reduce((a,b)->a*b);//No default parameter, so have to use Optional
        //without default reduce return Optional type
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,3,5,7);
        System.out.println(performMultiplication(integerList));
        List<Integer> integerList1 = Arrays.asList(1,3,5,7);
        System.out.println(performMultiplicationWithoutIdentity(integerList1));

    }
}

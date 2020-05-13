package org.test.prdicate;
import java.util.function.Predicate;
public class PredicateTest {
    static Predicate<Integer> integerPredicate =(a) -> {return a%2==0;};
    static Predicate<Integer> integerPredicate1 =(a) ->  a%2==0;
    static Predicate<Integer> integerPredicate2 =(a) ->  a%5==0;

    public static void getPredicateAnd(){
        System.out.println(integerPredicate1.and(integerPredicate2).test(10));
        System.out.println(integerPredicate1.and(integerPredicate2).test(9));
    }
    public static void getPredicateOr(){
        System.out.println(integerPredicate1.or(integerPredicate2).test(10));
        System.out.println(integerPredicate1.or(integerPredicate2).test(15));
    }
    public static void getPredicateNegate(){
        System.out.println(integerPredicate1.or(integerPredicate2).negate().test(9));

    }
    public static void main(String[] args) {
        getPredicateAnd();
        getPredicateOr();
        getPredicateNegate();
     //   System.out.println(integerPredicate.test(5));
                //OR
     //   System.out.println(integerPredicate1.test(4));

    }


}

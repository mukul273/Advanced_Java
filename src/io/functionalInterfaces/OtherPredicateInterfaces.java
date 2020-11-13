package io.functionalInterfaces;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class OtherPredicateInterfaces {
    public static void main(String[] args) {
        IntPredicate intPredicate = (i) -> i>100;
        System.out.println(intPredicate.test(100));
        System.out.println(intPredicate.test(101));
        System.out.println(intPredicate.test(99));

        System.out.println("--------------------");
        LongPredicate longPredicate = (i) -> i>100L;
        System.out.println(longPredicate.test(101L));
        System.out.println(longPredicate.test(101));

        System.out.println("--------------------");
        DoublePredicate doublePredicate = (i) -> i<100.1;
        System.out.println(doublePredicate.test(99.0));
        System.out.println(doublePredicate.test(111));
    }
}

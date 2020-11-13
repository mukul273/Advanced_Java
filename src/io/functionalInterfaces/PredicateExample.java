package io.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (i) -> i>10;
        System.out.println(predicate.test(2));
        System.out.println(predicate.test(10));
        System.out.println(predicate.test(11));

        // Another Use case - check if the number is even
        System.out.println("-------------------");
        Predicate<Integer> integerPredicate = (i) -> i%2==0;
        System.out.println(predicate.and(integerPredicate).test(11));
        System.out.println(predicate.and(integerPredicate).test(12));

        // Another Use case - OR case
        System.out.println("-------------------");
        System.out.println(predicate.or(integerPredicate).test(11));
        System.out.println(predicate.or(integerPredicate).test(12));

        // Another Use case - Negate case
        System.out.println("-------------------");
        System.out.println(predicate.and(integerPredicate.negate()).test(11));
        System.out.println(predicate.and(integerPredicate.negate()).test(12));
    }
}

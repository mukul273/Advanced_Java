package io.functionalInterfaces;

import io.common.Instructor;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample {
    public static void main(String[] args) {
        //Traditional Predicate example
        Predicate<Instructor> instructorPredicate = (i) -> i.isOnlineCourses();
        //Method reference of above is
        Predicate<Instructor> instructorPredicate1 = Instructor::isOnlineCourses;

        //Another Use case
        Function<Integer, Double> integerDoubleFunction = n -> Math.sqrt(n);
        Function<Integer, Double> integerDoubleFunction1 = Math::sqrt;

        // Yet another Use case
        Function<String, String> lowerCaseFunction = str -> str.toLowerCase();
        Function<String, String> lowerCaseMethodRef = String::toLowerCase;


    }
}

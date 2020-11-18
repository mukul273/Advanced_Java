package io.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        Function<Integer, Double> sqrt = (n) -> Math.sqrt(n);
        System.out.println("Square root is: " + sqrt.apply(64));

        //String use case
        Function<String, String> lowerCase = (n) -> n.toLowerCase();
        System.out.println("LowerCase:" + lowerCase.apply("CHIMP"));

        //Another String UseCase
        Function<String, String> conCat = (n) -> n.concat(" In Java");
        System.out.println(lowerCase.andThen(conCat).apply("OOP"));
        System.out.println("If we want to evaluate the second function and then apply the result with first function...");
        System.out.println(lowerCase.compose(conCat).apply("OOP"));
    }
}

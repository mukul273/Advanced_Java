package io.optional;

import java.util.Optional;

public class OptionalOrElseThrowExample {

    public static void main(String[] args) {

        // Use Case - OrElse
        Integer[] numbers = new Integer[10];
        numbers[0]=1;
        Optional<Integer> number = Optional.ofNullable(numbers[0]);
        int result = number.orElse(-1);
        System.out.println("result = " + result);
        Optional<Integer> anotherNumber = Optional.ofNullable(numbers[1]);
        result = anotherNumber.orElse(-1);
        System.out.println("result = " + result);

        //Use Case - OrElseGet
        result = anotherNumber.orElseGet( () -> -1);
        System.out.println("result = " + result);

        // Use Case OrElseThrow
        Integer integer = anotherNumber.orElseThrow(RuntimeException::new);
        System.out.println("integer = " + integer);
    }
}

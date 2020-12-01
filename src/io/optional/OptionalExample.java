package io.optional;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalExample {

    public static void main(String[] args) {
        Integer[] numbers = new Integer[10];

        //This will throw the NullPointerException
        //int number = numbers[1].intValue();
        //So we have do below
        Optional number = Optional.ofNullable(numbers[1]);

        System.out.println("number = " + number);
    }
}

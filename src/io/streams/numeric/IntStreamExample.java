package io.streams.numeric;

import java.util.Random;
import java.util.stream.IntStream;

public class IntStreamExample {

    public static void main(String[] args) {
        //Use case - of
        IntStream numbers = IntStream.of(1,2,3,4,5);
        numbers.forEach(System.out::print);
        System.out.println();

        // Use case - iterate
        IntStream iterateNumbers = IntStream.iterate(0, operand -> operand+2).limit(10);
        iterateNumbers.forEach(System.out::print);
        System.out.println();

        // Use case - generate
        IntStream generateNumbers = IntStream.generate(new Random()::nextInt).limit(10);
        generateNumbers.forEach(System.out::println);
        System.out.println();

        // Use Case - range
        IntStream rangeNumbers = IntStream.range(1,5);
        rangeNumbers.forEach(System.out::print);
        System.out.println();

        // Another Use Case - range
        rangeNumbers = IntStream.rangeClosed(1,5);
        rangeNumbers.forEach(System.out::print);
        System.out.println();
    }
}

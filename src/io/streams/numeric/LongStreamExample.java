package io.streams.numeric;

import java.util.Random;
import java.util.stream.LongStream;

public class LongStreamExample {

    public static void main(String[] args) {
        //Use case - of
        LongStream numbers = LongStream.of(1,2,3,4,5);
        numbers.forEach(System.out::print);
        System.out.println();

        // Use case - iterate
        LongStream iterateNumbers = LongStream.iterate(0, operand -> operand+2).limit(10);
        iterateNumbers.forEach(System.out::print);
        System.out.println();

        // Use case - generate
        LongStream generateNumbers = LongStream.generate(new Random()::nextLong).limit(10);
        generateNumbers.forEach(System.out::println);
        System.out.println();

        // Use Case - range
        LongStream rangeNumbers = LongStream.range(1,5);
        rangeNumbers.forEach(System.out::print);
        System.out.println();

        // Another Use Case - rangeClosed
        rangeNumbers = LongStream.rangeClosed(1,5);
        rangeNumbers.forEach(System.out::print);
        System.out.println();
    }
}

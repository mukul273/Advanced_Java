package io.streams.numeric;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class DoubleStreamExample {

    public static void main(String[] args) {
        //Use case - of
        DoubleStream numbers = DoubleStream.of(1.1,2.1,3.1,4.1,5.1);
        numbers.forEach(System.out::println);
        System.out.println();

        // Use case - iterate
        DoubleStream iterateNumbers = DoubleStream.iterate(0, operand -> operand+2).limit(10);
        iterateNumbers.forEach(System.out::println);
        System.out.println();

        // Use case - generate
        DoubleStream generateNumbers = DoubleStream.generate(new Random()::nextDouble).limit(10);
        generateNumbers.forEach(System.out::println);
        System.out.println();

        // Use Case - range
        DoubleStream rangeNumbers = LongStream.range(1,5).asDoubleStream();
        rangeNumbers.forEach(System.out::println);
        System.out.println();

        // Another Use Case - rangeClosed
        rangeNumbers = LongStream.rangeClosed(1,5).asDoubleStream();
        rangeNumbers.forEach(System.out::println);
        System.out.println();
    }
}

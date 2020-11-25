package io.streams.operations;

import java.util.Random;
import java.util.stream.Stream;

public class StreamFactoryMethodsExample {

    public static void main(String[] args) {

        //Use case Of()
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 0);
        integerStream.forEach(System.out::print);
        System.out.println("\n--------");

        //Use Case - iterate()
        Stream<Integer> iterate = Stream.iterate(0, i -> i + 2).limit(10);
        iterate.forEach(System.out::print);

        System.out.println("\n--------");
        //Use Case - generate()
        Stream<Integer> generate = Stream.generate(new Random()::nextInt).limit(10);
        generate.forEach(System.out::println);
    }
}

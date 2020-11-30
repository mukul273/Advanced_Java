package io.streams.parallelStreams;

import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static void main(String[] args) {
        System.out.println("sumOfSequentialStream:"+ sumOfSequentialStream());
        System.out.println("sumOfParallelStream:"+ sumOfParallelStream());
    }

    public static int sumOfSequentialStream() {
        return IntStream.rangeClosed(0,5000).sum();
    }

    public static int sumOfParallelStream() {
        return IntStream.rangeClosed(0,5000).parallel().sum();
    }
}

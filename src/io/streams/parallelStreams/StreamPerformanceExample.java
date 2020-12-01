package io.streams.parallelStreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class StreamPerformanceExample {

    public static void main(String[] args) {
        int loop=20;
        long result = measurePerformance(StreamPerformanceExample::sumOfSequentialStream, loop);
        System.out.println("result = " + result);
        long result1 = measurePerformance(StreamPerformanceExample::sumOfParallelStream, loop);
        System.out.println("result = " + result1);
    }

    public static int sumOfSequentialStream() {
        return IntStream.rangeClosed(0,5000).sum();
    }

    public static int sumOfParallelStream() {
        return IntStream.rangeClosed(0,5000).parallel().sum();
    }

    public static long measurePerformance(Supplier<Integer> integerSupplier, int noOfTimes) {
        long startTime = System.currentTimeMillis();
        for(int i=0; i<noOfTimes; i++) {
            integerSupplier.get();
        }
        return System.currentTimeMillis() - startTime;

    }
}

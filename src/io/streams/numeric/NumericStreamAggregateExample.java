package io.streams.numeric;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

    public static void main(String[] args) {
        // Use Case - sum
        int sum = IntStream.range(1,10).sum();
        System.out.println("Sum is:"+sum);

        // Use Case - max
        int max = IntStream.rangeClosed(1,10).max().getAsInt();
        System.out.println("Max number is:"+ max);

        // Use Case - min
        int min = IntStream.rangeClosed(1,10).min().getAsInt();
        System.out.println("Min number is:"+ min);

        //Use case - average
        OptionalDouble average = LongStream.rangeClosed(1, 5).asDoubleStream().average();
        System.out.println("Average is:"+average);
        System.out.println("Average is:"+average.getAsDouble());
    }
}

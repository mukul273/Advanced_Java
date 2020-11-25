package io.streams.operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLimitAndSkipExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,6,7,0);
        List<Integer> limit = numbers.stream().limit(5).collect(Collectors.toList());
        System.out.println(limit);

        // Use Case Skip
        List<Integer> collect = numbers.stream().skip(5).collect(Collectors.toList());
        System.out.println(collect);
    }
}

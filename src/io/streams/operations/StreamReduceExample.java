package io.streams.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        // Use Case - with identity param
        int result = numbers.stream()
                .reduce(0, (first, second)->first+second);
        System.out.println(result);

        // use Case - Optional and BinaryOperator
        Optional results = numbers.stream().reduce((first, second) -> first+second);
        System.out.println(results);
        System.out.println(results.get());
    }
}

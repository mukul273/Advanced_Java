package io.streams.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMixExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,6,7,0);

        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        System.out.println(min);
        System.out.println(min.get());

        //Use Case reduce
        Optional<Integer> reduce = numbers.stream().reduce(Integer::min);
        System.out.println(reduce);
    }
}

package io.streams.operations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamMaxExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,6,7,0);

        // Use case - max
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);

        System.out.println(max);
        System.out.println(max.get());

        //Use case reduce
        Integer reduce = numbers.stream().reduce(0, Integer::max);
        System.out.println(reduce);

        //Another Use case reduce
        Optional<Integer> reduce1 = numbers.stream().reduce(Integer::max);
        System.out.println(reduce1);
        System.out.println(reduce1.get());

    }
}

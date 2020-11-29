package io.streams.numeric;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingUnboxingExample {

    public static void main(String[] args) {
        List<Integer> numbers;

        // Use case - Boxing
        IntStream numStream = IntStream.rangeClosed(1,10);
        numbers = numStream.boxed().collect(Collectors.toList());
        numbers.forEach(System.out::print);
        System.out.println();

        //Use Case - Unboxing
        Optional<Integer> sum = numbers.stream().reduce((a,b) -> a+b);
        System.out.println(sum);
        System.out.println(sum.get());

        //Another Use Case - Unboxing
        int sum1 = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum1);
    }
}

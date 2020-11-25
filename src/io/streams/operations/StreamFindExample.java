package io.streams.operations;

import io.common.Instructor;
import io.functionalInterfaces.Instructors;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,6,7,0);
        Optional<Integer> first = numbers.stream().findFirst();
        System.out.println(first.get());

        Optional<Instructor> any = Instructors.getAllInstructors().stream().findAny();
        System.out.println(any.get()); //This behaviour will change in case of parallel stream.
    }
}

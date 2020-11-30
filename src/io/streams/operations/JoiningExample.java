package io.streams.operations;

import io.common.Instructor;
import io.functionalInterfaces.Instructors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningExample {

    public static void main(String[] args) {

        // Use Case - no delimiter
        String collect = Stream.of("1", "2", "3", "4").collect(Collectors.joining());
        System.out.println(collect);

        //Use case - delimiter
        collect = Stream.of("1", "2", "3", "4").collect(Collectors.joining(","));
        System.out.println(collect);

        // Use case - delimiter, prefix and suffix
        collect = Stream.of("1", "2", "3", "4").collect(Collectors.joining(",", "{", "}"));
        System.out.println(collect);

        collect = Instructors.getAllInstructors().stream()
                .map(Instructor::getName)
                .collect(Collectors.joining(","));
        System.out.println(collect);
    }
}

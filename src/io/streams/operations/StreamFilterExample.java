package io.streams.operations;

import io.common.Instructor;
import io.functionalInterfaces.Instructors;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAllInstructors().stream()
                .filter(instructor -> instructor.getExperience()>10)
                .sorted(Comparator.comparing(Instructor::getName))
                .collect(Collectors.toList());
        instructors.forEach(System.out::println);
    }
}

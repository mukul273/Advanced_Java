package io.streams.operations;

import io.common.Instructor;
import io.functionalInterfaces.Instructors;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorExample {

    public static void main(String[] args) {
        List<Instructor> instructorList = Instructors.getAllInstructors().stream()
                .sorted(Comparator.comparing(Instructor::getName))
                .collect(Collectors.toList());
        instructorList.forEach(System.out::println);

        // Use case - reverse order
        System.out.println("Reversed Order Demo");
        List<Instructor> collect = Instructors.getAllInstructors().stream()
                .sorted(Comparator.comparing(Instructor::getName).reversed())
                .collect(Collectors.toList());
        collect.forEach(System.out::println);

    }
}

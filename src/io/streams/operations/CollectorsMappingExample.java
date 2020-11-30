package io.streams.operations;

import io.common.Instructor;
import io.functionalInterfaces.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsMappingExample {

    public static void main(String[] args) {
        List<String> collect = Instructors.getAllInstructors().stream()
                .map(Instructor::getName)
                .collect(Collectors.toList());
        System.out.println("collect = " + collect);
        collect.forEach(System.out::print);
        System.out.println();

        // Use Case - Mapping
        collect = Instructors.getAllInstructors().stream()
                .collect(Collectors.mapping(Instructor::getName, Collectors.toList()));
        collect.forEach(System.out::print);
        System.out.println();

        // Use Case - GroupingBy
        Map<Integer, List<String>> collect1 = Instructors.getAllInstructors().stream()
                .collect(
                        Collectors.groupingBy(
                                Instructor::getExperience,
                                Collectors.mapping(
                                        Instructor::getName,
                                        Collectors.toList()
                                )
                        )
                );
        System.out.println("collect1 = " + collect1);
    }
}

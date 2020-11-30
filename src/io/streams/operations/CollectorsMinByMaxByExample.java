package io.streams.operations;

import io.common.Instructor;
import io.functionalInterfaces.Instructors;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsMinByMaxByExample {

    public static void main(String[] args) {

        // Use case - minBy()
        Optional<Instructor> collect = Instructors.getAllInstructors().stream()
                .collect(
                        Collectors.minBy(
                                Comparator.comparing(
                                        Instructor::getExperience
                                )
                        )
                );
        System.out.println("minBy() = " + collect);
        System.out.println("minBy() = " + collect.get());

        // Use case - maxBy()
        collect = Instructors.getAllInstructors().stream()
                .collect(
                        Collectors.maxBy(
                                Comparator.comparing(
                                        Instructor::getExperience
                                )
                        )
                );
        System.out.println("maxBy() = " + collect);
        System.out.println("maxBy() = " + collect.get());
    }
}

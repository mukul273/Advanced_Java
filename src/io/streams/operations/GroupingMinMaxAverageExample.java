package io.streams.operations;

import io.common.Instructor;
import io.functionalInterfaces.Instructors;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupingMinMaxAverageExample {

    public static void main(String[] args) {

        // Use case - grouping the instructors in 2 sets based on onlinecourses and also returns max no of years of exp.
        Map<Boolean, Optional<Instructor>> collect = Instructors.getAllInstructors().stream()
                .collect(
                        Collectors.groupingBy(
                                Instructor::isOnlineCourses,
                                Collectors.maxBy(Comparator.comparing(Instructor::getExperience))
                        )
                );
        collect.forEach( (key, value) -> {
            System.out.println("key:"+key+" value:"+value);
        });
        System.out.println();

        // Use Case - collectingAndThen
        Map<Boolean, Object> collect1 = Instructors.getAllInstructors().stream()
                .collect(
                        Collectors.groupingBy(
                                Instructor::isOnlineCourses,
                                Collectors.collectingAndThen(
                                        Collectors.maxBy(Comparator.comparing(Instructor::getExperience)),
                                        Optional::get
                                )

                        )
                );
        collect1.forEach( (key, value) -> {
            System.out.println("key:"+key+" value:"+value);
        });
        System.out.println();

        // Use case - average years of experience of instructors who teaches online
        Map<Boolean, Double> collect2 = Instructors.getAllInstructors().stream()
                .collect(
                        Collectors.groupingBy(
                                Instructor::isOnlineCourses,
                                Collectors.averagingInt(Instructor::getExperience)
                        )
                );
        collect2.forEach( (key, value) -> {
            System.out.println("key:"+key+" value:"+value);
        });
        System.out.println();

        // Use Case - Statistical summery from properties of grouped elements
        Map<Boolean, IntSummaryStatistics> collect3 = Instructors.getAllInstructors().stream()
                .collect(
                        Collectors.groupingBy(
                                Instructor::isOnlineCourses,
                                Collectors.summarizingInt(Instructor::getExperience)
                        )
                );
        collect3.forEach( (key, value) -> {
            System.out.println("key:"+key+" value:"+value);
        });
        System.out.println();
    }
}

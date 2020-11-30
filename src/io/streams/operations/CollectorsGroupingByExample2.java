package io.streams.operations;

import io.common.Instructor;
import io.functionalInterfaces.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsGroupingByExample2 {

    public static void main(String[] args) {

        // Use Case - GroupingBy length of string, also returning names those contains D
        List<String> instructorsNames = Instructors.getAllInstructors().stream()
                .map(Instructor::getName)
                .collect(Collectors.toList());
        Map<Integer, List<String>> matchers = instructorsNames.stream()
                .collect(
                        Collectors.groupingBy(
                                String::length,
                                Collectors.filtering(
                                        s -> s.contains("D"),
                                        Collectors.toList()
                                ))
                );
        System.out.println("matchers:"+matchers);
        System.out.println();

        // Use case - instructor grouping by exp>10 as senior and filter them on online courses
        Map<String, List<Instructor>> collect = Instructors.getAllInstructors().stream()
                .collect(
                        Collectors.groupingBy(
                                instructor -> instructor.getExperience() > 10 ? "Senior" : "Junior",
                                Collectors.filtering(
                                        Instructor::isOnlineCourses,
                                        Collectors.toList())
                        )
                );
        System.out.println(collect);
        collect.forEach( (key, value) -> {
            System.out.println("key:"+key+" value:"+value);
        });
    }
}

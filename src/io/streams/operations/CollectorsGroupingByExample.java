package io.streams.operations;

import io.common.Instructor;
import io.functionalInterfaces.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsGroupingByExample {

    public static void main(String[] args) {

        // Use Case - groupingBy
        List<String> instructorsNames = Instructors.getAllInstructors().stream()
                .map(Instructor::getName)
                .collect(Collectors.toList());
        Map<Integer, List<String>> collect = instructorsNames.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("collect = " + collect);

        // Use Case - groupingBy(classifier)
        Map<String, List<Instructor>> collectorsMap = Instructors.getAllInstructors().stream()
                .collect(Collectors.groupingBy(Instructor::getGender));
        System.out.println("collect1 = " + collectorsMap);
        System.out.println();
        collectorsMap.forEach( (a,b) -> {
            System.out.println(a + "" + b);
        });
        System.out.println();

        // Another Use case - groupingBy(classifier)
        Map<String, List<Instructor>> collect1 = Instructors.getAllInstructors().stream()
                .collect(Collectors.groupingBy(instructor ->
                        instructor.getExperience() > 10 ? "Senior" : "Junior"
                ));
        collect1.forEach( (key, value) -> {
            System.out.println("Key:"+key+" value:"+value);
        });
    }
}

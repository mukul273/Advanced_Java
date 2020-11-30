package io.streams.operations;

import io.common.Instructor;
import io.functionalInterfaces.Instructors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PartitioningByExample {

    public static void main(String[] args) {
        //Partition instructors in 2 groups 1. greater than 10 yrs of exp 2. less than equal 10

        Predicate<Instructor> instructorPredicate = instructor -> instructor.getExperience()>10;

        Map<Boolean, List<Instructor>> collect = Instructors.getAllInstructors().stream()
                .collect(
                        Collectors.partitioningBy(instructorPredicate)
                );
        System.out.println("collect = " + collect);
        collect.forEach( (key, value) -> {
            System.out.println("key:"+key+" value:"+value);
        });
        System.out.println();

        // Use Case - return set
        Map<Boolean, Set<Instructor>> collect1 = Instructors.getAllInstructors().stream()
                .collect(
                        Collectors.partitioningBy(
                                instructorPredicate,
                                Collectors.toSet()
                        )
                );
        collect1.forEach( (key, value) -> {
            System.out.println("key:"+key+" value:"+value);
        });
        System.out.println();
    }
}

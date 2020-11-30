package io.streams.operations;

import io.common.Instructor;
import io.functionalInterfaces.Instructors;

import java.util.stream.Collectors;

public class CountingExample {

    public static void main(String[] args) {
        long count = Instructors.getAllInstructors().stream()
                .filter(Instructor::isOnlineCourses)
                .count();

        System.out.println("count = " + count);
        
        // Use case - collectors.counting
        count = Instructors.getAllInstructors().stream()
                .filter(Instructor::isOnlineCourses)
                .collect(Collectors.counting());
        System.out.println("count = " + count);
        
    }
}

package io.streams.operations;

import io.common.Instructor;
import io.functionalInterfaces.Instructors;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

    public static void main(String[] args) {

        List<String> coursesList = Instructors.getAllInstructors()
                                    .stream()
                                    .map(Instructor::getCourses)
                                    .flatMap(List::stream)
                                    .collect(Collectors.toList());
        System.out.println(coursesList);
    }
}

package io.streams.operations;

import io.common.Instructor;
import io.functionalInterfaces.Instructors;

import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

    public static void main(String[] args) {
        List<String> instructorsNames = Instructors.getAllInstructors()
                .stream()
                .map(Instructor::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(instructorsNames);
    }
}

package io.streams.operations;

import io.common.Instructor;
import io.functionalInterfaces.Instructors;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {

        long count = Instructors.getAllInstructors()
                .stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .count();
        System.out.println("Total Courses Count:"+count);

        // Use Case - Distinct
        long count1 = Instructors.getAllInstructors()
                .stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .count();
        System.out.println("Total distinct Courses Count:"+count1);

        // Use Case - distinct courses names
        List<String> distinctCourses = Instructors.getAllInstructors()
                .stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Total distinct Courses:"+distinctCourses);

        // Use case - Sorted
        List<String> collect = Instructors.getAllInstructors()
                .stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted List of courses:"+collect);

        // Use AnyMatch()
        boolean j = Instructors.getAllInstructors()
                .stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .anyMatch(s -> s.startsWith("J"));
        System.out.println("are there any courses start with J:"+j);
        // Use Case - allMatch
        boolean j1 = Instructors.getAllInstructors()
                .stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .allMatch(s -> s.startsWith("CI/CD"));
        System.out.println("are there all courses matching given string:"+j1);

        // Use Case - nonMatch
        boolean b = Instructors.getAllInstructors()
                .stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .noneMatch(s -> s.startsWith("JAVA"));
        System.out.println("are there any courses matching given string:"+b);

    }
}

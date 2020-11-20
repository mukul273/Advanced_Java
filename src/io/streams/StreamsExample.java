package io.streams;

import io.common.Instructor;
import io.functionalInterfaces.Instructors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        Predicate<Instructor> teachesOnline = (teacher) -> teacher.isOnlineCourses();
        Predicate<Instructor> yrsOfExp = (teacher) -> teacher.getExperience()>10;

        List<Instructor> instructors = Instructors.getAllInstructors();
        Map<String, List<String>> mapNamesAndCourses = instructors.stream()
                .filter(teachesOnline)
                .filter(yrsOfExp)
                .collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));

        System.out.println(mapNamesAndCourses);

        //Use Case - Convert map to ArrayList in various ways
        System.out.println("Convert MAP to List");
        Map<String, String> testMap = new HashMap<>();
        testMap.put("name", "Chimp");
        testMap.put("address", "USA");
        testMap.put("phone","000-000-0000");

        List<String> collect1 = testMap.values().stream()
                .collect(Collectors.toList()); // This is using Stream
        System.out.println(collect1);
        ArrayList<String> strings = new ArrayList<>(testMap.keySet()); // This is another way
        System.out.println(strings);



        //Use Case- ToList
        System.out.println("ToList");
        List<Instructor> listInstr= instructors.stream()
                .filter(teachesOnline)
                .filter(yrsOfExp)
                .collect(Collectors.toList());
        System.out.println(listInstr);

        //Another Use case - count
        Long collect = instructors.stream()
                .filter(teachesOnline)
                .filter(yrsOfExp)
                .collect(Collectors.counting());

        System.out.println(collect);
    }
}

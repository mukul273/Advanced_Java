package io.functionalInterfaces;

import io.common.Instructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionInstructorExample {
    public static void main(String[] args) {
        // Use Case - Get the MAP of instructors with name as key and experience as value

        Function<List<Instructor>, Map<String, Integer>> mapFunction =  (instructors -> {
           Map<String, Integer> maps = new HashMap<>();
           instructors.forEach(instructor -> {
               maps.put(instructor.getName(), instructor.getExperience());
           });
           return maps;
        });

        System.out.println(mapFunction.apply(Instructors.getAllInstructors()));

        // Use Case - Predicate will return if the instructor has online courses
        Predicate<Instructor> onlineCoursesPredicate = (instructor) -> instructor.isOnlineCourses();
        Function<List<Instructor>, Map<String, Integer>> mapPredicateFunction =  (instructors -> {
            Map<String, Integer> maps = new HashMap<>();
            instructors.forEach(instructor -> {
                if(onlineCoursesPredicate.test(instructor))
                    maps.put(instructor.getName(), instructor.getExperience());
            });
            return maps;
        });

        System.out.println(mapPredicateFunction.apply(Instructors.getAllInstructors()));

    }
}

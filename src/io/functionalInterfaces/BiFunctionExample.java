package io.functionalInterfaces;

import io.common.Instructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
    public static void main(String[] args) {
        //Use Case - accepts List<Instructor> and Predicate and returns map of String, integer

        Predicate<Instructor> onlineCoursesPredicate = (instructor) -> !instructor.isOnlineCourses();
        BiFunction<List<Instructor>, Predicate<Instructor>, Map<String, Integer>> mapBiFunction = ((instructors, instructorPredicate) -> {
            Map<String, Integer> instructorsMap = new HashMap<>();
            instructors.forEach(instructor -> {
                if(instructorPredicate.test(instructor))
                    instructorsMap.put(instructor.getName(), instructor.getExperience());
            });
            return instructorsMap;
        });
        System.out.println(mapBiFunction.apply(Instructors.getAllInstructors(), onlineCoursesPredicate));
    }
}

package io.functionalInterfaces;

import io.common.Instructor;

import java.util.List;
import java.util.function.Predicate;

public class PredicateInstructorExample {
    public static void main(String[] args) {
        List<Instructor> instructorList = Instructors.getAllInstructors();

        Predicate<Instructor> instructorPredicate = (i) -> i.isOnlineCourses();

        Predicate<Instructor> experiencePredicate = (i) -> i.getExperience()>10;

        instructorList.forEach(instructor -> {
            if(instructorPredicate.test(instructor))
                System.out.println(instructor);
        });

        //Use Case - if instructor has online courses and has experience more than certain no of years
        System.out.println("--------------------");
        instructorList.forEach(instructor -> {
            if(instructorPredicate.and(experiencePredicate).test(instructor))
                System.out.println(instructor);
        });
    }
}

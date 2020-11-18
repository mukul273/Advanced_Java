package io.functionalInterfaces;

import io.common.Instructor;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        List<Instructor> allInstructors = Instructors.getAllInstructors();

        BiPredicate<Boolean, Integer> booleanIntegerBiPredicate = (online, exp) -> online == true && exp>10;

        //BiConsumer print name, course
        BiConsumer<String, List<String>> printInstr = (name, courses) -> System.out.println("Name:"+name+" Courses:"+courses);

        allInstructors.forEach(instructor -> {
            if(booleanIntegerBiPredicate.test(instructor.isOnlineCourses(), instructor.getExperience()))
                printInstr.accept(instructor.getName().concat(" Title:").concat(instructor.getTitle()), instructor.getCourses());
        });
    }
}

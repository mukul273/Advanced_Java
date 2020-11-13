package io.functionalInterfaces;

import io.common.Instructor;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateBiConsumerExample {
    public static void main(String[] args) {
        List<Instructor> allInstructors = Instructors.getAllInstructors();

        Predicate<Instructor> onlineInstructor = (i) -> i.isOnlineCourses();
        Predicate<Instructor> experiencedInstructor = (i) -> i.getExperience()>10;

        //BiConsumer print name, course
        BiConsumer<String, List<String>> printInstr = (name, courses) -> System.out.println("Name:"+name+" courses:"+courses);

        allInstructors.forEach(instructor -> {
            if(onlineInstructor.and(experiencedInstructor).test(instructor))
                printInstr.accept(instructor.getName(), instructor.getCourses());
        });

    }
}

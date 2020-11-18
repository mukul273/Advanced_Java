package io.functionalInterfaces;

import io.common.Instructor;

import java.util.function.Predicate;

public class ConvertToMethodReferenceExample {
    public static void main(String[] args) {
        Predicate<Instructor> experiencePredicate = ConvertToMethodReferenceExample::getExperienceThan;
        Instructors.getAllInstructors().forEach(instructor -> {
            if(experiencePredicate.test(instructor))
                System.out.println(instructor);
        });
    }

    public static boolean getExperienceThan(Instructor instructor) {
        if(instructor.getExperience()>10)
            return true;
        else
            return false;
    }
}

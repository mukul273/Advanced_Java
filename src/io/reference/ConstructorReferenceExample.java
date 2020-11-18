package io.reference;

import io.common.Instructor;

import java.util.Arrays;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        InstructorFactory instructorFactory = Instructor::new;
        Instructor instructor = instructorFactory.getInstructor("Mike",
                10, "Software Developer", "Male", true, Arrays.asList("Java Programming", "AI and ML"));
        System.out.println(instructor);
    }
}

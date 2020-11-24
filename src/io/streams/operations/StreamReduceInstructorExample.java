package io.streams.operations;

import io.common.Instructor;
import io.functionalInterfaces.Instructors;

import java.util.Optional;

public class StreamReduceInstructorExample {

    public static void main(String[] args) {
        Optional<Instructor> instructors = Instructors.getAllInstructors().stream()
                .reduce((s1, s2) -> s1.getExperience() > s2.getExperience()? s1 : s2
        );

        System.out.println(instructors);
    }
}

package io.functionalInterfaces;
import io.common.Instructor;

import java.util.Arrays;
import java.util.List;

public class Instructors {

    public static List<Instructor> getAllInstructors() {
        Instructor instructor = new Instructor(
                "Mike",
                15,
                "AI guys",
                "male",
                true,
                Arrays.asList("AI/ML", "AWS Lambda", "Data Engineering", "AWS Solution Architect"));

        Instructor instructor1 = new Instructor(
                "Genie",
                10,
                "Life Coach",
                "female",
                false,
                Arrays.asList("Elevate Yourself", "Little hacks", "Don't give up"));

        Instructor instructor2 = new Instructor(
                "Dave",
                15,
                "Comp Engg",
                "male",
                false,
                Arrays.asList("DS & Algo", "AWS IAM", "Data Analysis", "CI/CD"));

        return Arrays.asList(instructor, instructor1, instructor2);
    }
}

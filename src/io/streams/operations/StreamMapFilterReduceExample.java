package io.streams.operations;

import io.common.Instructor;
import io.functionalInterfaces.Instructors;

public class StreamMapFilterReduceExample {

    public static void main(String[] args) {

        Integer experience = Instructors.getAllInstructors().stream()
                .filter(Instructor::isOnlineCourses)
                .map(Instructor::getExperience)
                .reduce(0, Integer::sum);

        System.out.println(experience);

    }
}

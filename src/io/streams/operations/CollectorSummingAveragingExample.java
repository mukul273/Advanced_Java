package io.streams.operations;

import io.common.Instructor;
import io.functionalInterfaces.Instructors;

import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

public class CollectorSummingAveragingExample {

    public static void main(String[] args) {
        
        // Use Case - Summing int
        Integer summing = Instructors.getAllInstructors().stream()
                .collect(Collectors.summingInt(Instructor::getExperience));
        System.out.println("summingint = " + summing);


        //Use Case - averaging int
        Double averaging = Instructors.getAllInstructors().stream()
                .collect(Collectors.averagingInt(Instructor::getExperience));
        System.out.println("averagingint = " + averaging);

        // USe case - summingLong
        Long summingLong = Instructors.getAllInstructors().stream()
                .collect(Collectors.summingLong(Instructor::getExperience));
        System.out.println("summingLong = " + summingLong);

        //Use Case - averaging long
        Double averagingLong = Instructors.getAllInstructors().stream()
                .collect(Collectors.averagingLong(Instructor::getExperience));
        System.out.println("averagingLong = " + averagingLong);

        // Use Case - summing double
        Double summingDouble = Instructors.getAllInstructors().stream()
                .collect(Collectors.summingDouble(Instructor::getExperience));
        System.out.println("summingDouble = " + summingDouble);

        //Use Case - averaging Double
        Double averagingDouble = Instructors.getAllInstructors().stream()
                .collect(Collectors.averagingDouble(Instructor::getExperience));
        System.out.println("averagingDouble = " + averagingDouble);

    }
}

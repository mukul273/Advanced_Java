package io.functionalInterfaces;

import io.common.Instructor;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerAnotherExample {
    public static void main(String[] args) {
        List<Instructor> allInstructors = Instructors.getAllInstructors();

        BiConsumer<String, String> instructors = (name, gender)-> System.out.println("name:"+name+" gender:"+gender);
        allInstructors.forEach(instructor -> {
            instructors.accept(instructor.getName(), instructor.getGender()); // For each doesn't accept BiConsumer Type, only Consumer type is allowed
        });

        System.out.println("______________________________");
        // Use Case for getting String, list<String> using BiConsumer
        BiConsumer<String, List<String>> courses = (name, courseList) -> System.out.println("name:"+name+" courses:"+courseList);
        allInstructors.forEach(instructor -> {
            courses.accept(instructor.getName(), instructor.getCourses());
        });

        System.out.println("______________________________");
        // Use Case for getting the String, String using filter, we are using BiConsumer object from line 12 here directly
        allInstructors.forEach(instructor -> {
            if(instructor.isOnlineCourses())
                instructors.accept(instructor.getName(), instructor.getGender());
        });

    }
}

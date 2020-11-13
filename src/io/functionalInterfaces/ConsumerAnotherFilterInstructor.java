package io.functionalInterfaces;

import io.common.Instructor;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerAnotherFilterInstructor {

    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAllInstructors();
        Consumer<Instructor> c1 = (s1) -> System.out.println(s1);

        instructors.forEach(s1->{
            if (s1.getExperience() > 10){
                c1.accept(s1);
            }
        });
    }
}

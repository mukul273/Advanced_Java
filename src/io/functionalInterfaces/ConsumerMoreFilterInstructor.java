package io.functionalInterfaces;

import io.common.Instructor;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerMoreFilterInstructor {

    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAllInstructors();

        Consumer<Instructor> consumer = (instr) -> {
            System.out.print(instr.getName());
        };
        Consumer<Instructor> consumer1 = (instr) -> {
            System.out.println(instr.getCourses());
        };

        instructors.forEach(consumer.andThen(consumer1));
    }
}

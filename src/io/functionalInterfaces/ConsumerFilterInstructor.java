package io.functionalInterfaces;

import io.common.Instructor;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerFilterInstructor {

    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAllInstructors();

        Consumer<Instructor> consumer = (instr) -> {
            System.out.println(instr.getName());
        };

        instructors.forEach(consumer);
    }
}

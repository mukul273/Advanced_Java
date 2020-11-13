package io.functionalInterfaces;

import io.common.Instructor;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExampleInstructor {

    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAllInstructors();

        Consumer<Instructor> consumer = (instr) -> {
            System.out.println(instr);
        };

        instructors.forEach(consumer);
    }
}

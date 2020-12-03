package io.nineplus;

import io.common.Instructor;
import io.functionalInterfaces.Instructors;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class VarWithLambdaExample {

    public static void main(String[] args) {
        var allInstructors = Instructors.getAllInstructors();
        Predicate<Instructor> instructorPredicate = (var s) -> s.getExperience()>10;

        allInstructors.forEach( instructor -> {
            if(instructorPredicate.test(instructor)) {
                var result = instructor.getName();
                System.out.println("result = " + result);
            }
        });

        BiFunction<Integer, Integer, Integer> sum = (var x, var y) -> x+y;
        //BiFunction<Integer, Integer, Integer> sum = (var x, int y) -> x+y;//Can't mix var with other param types
        System.out.println("sum = " + sum.apply(2,4));


    }
}

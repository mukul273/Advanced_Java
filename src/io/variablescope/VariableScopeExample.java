package io.variablescope;

import io.common.Instructor;
import io.functionalInterfaces.Instructors;

import java.util.List;
import java.util.function.IntConsumer;

public class VariableScopeExample {
    private static int k=0;

    public static void main(String[] args) {
        int localVar = 10;

        //IntConsumer intConsumer = (localVar) -> System.out.println(localVar*10); // This would not work because localVar is already defined in local scope
        IntConsumer intConsumer = (n) -> System.out.println(n*10);

        int anotherVar = 10;
        List<Instructor> instructors = Instructors.getAllInstructors();
        instructors.forEach(instructor -> {
            //System.out.println(instructor + ++anotherVar); // This would not work because anotherVar can't be modified (Effectively final)
            System.out.println(instructor + " : " + anotherVar); // This works only when line no 26 is commented because we tried to modify the variable at 26
                                                                // Interestingly, we can modify just like 26 but can't use it like on 20.
            System.out.println(instructor + " : " + k);
        });
        //anotherVar = 11;
        k++; // This is because K is class level var and we can use it in teh lambda function, modify it without any problem.
    }
}

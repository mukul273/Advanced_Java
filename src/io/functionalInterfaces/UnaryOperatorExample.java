package io.functionalInterfaces;

import java.util.function.*;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperatorInt = (i) -> i*10;
        System.out.println(unaryOperatorInt.apply(12));

        // Same Use case again with Function
        Function<Integer, Integer> func = (integer) -> integer*10;
        System.out.println(func.apply(19));

        // Primitive Data Types Use case
        IntUnaryOperator intUnaryOperator = i -> i*20;
        System.out.println(intUnaryOperator.applyAsInt(12));

        LongUnaryOperator longUnaryOperator = i -> i*20;
        System.out.println(longUnaryOperator.applyAsLong(12));

        DoubleUnaryOperator doubleUnaryOperator = i -> i*20;
        System.out.println(doubleUnaryOperator.applyAsDouble(13));

    }
}

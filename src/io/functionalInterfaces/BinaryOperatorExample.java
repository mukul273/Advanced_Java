package io.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> integerBinaryOperator = (i,j) -> i*j;
        System.out.println(integerBinaryOperator.apply(10, 20));

        // Use case Comparator
        Comparator<Integer> integerComparator = (i, j) -> i.compareTo(j);

        BinaryOperator<Integer> binaryMaxOperator = BinaryOperator.maxBy(integerComparator);
        System.out.println(binaryMaxOperator.apply(11,100));

        BinaryOperator<Integer> binaryMinOperator = BinaryOperator.minBy(integerComparator);
        System.out.println(binaryMinOperator.apply(11,100));

        IntBinaryOperator intBinaryOperator = (i,j) -> i*j;
        System.out.println(intBinaryOperator.applyAsInt(10,20));

        LongBinaryOperator longBinaryOperator = (i, j) -> i*j;
        System.out.println(longBinaryOperator.applyAsLong(11L,21L));

        DoubleBinaryOperator doubleBinaryOperator = (i, j) -> i*j;
        System.out.println(doubleBinaryOperator.applyAsDouble(12,22));
    }
}

package io.functionalInterfaces;

import java.util.function.IntConsumer;

public class IntConsumerExample {
    public static void main(String[] args) {
        IntConsumer intConsumer = (intArg) -> {
            System.out.println(intArg *10);
        };
        intConsumer.accept(12);
    }
}

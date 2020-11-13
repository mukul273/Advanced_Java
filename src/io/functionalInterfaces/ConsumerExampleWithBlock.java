package io.functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerExampleWithBlock {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (x) -> {
            System.out.println("x*x:" + (x*x));
            System.out.println("x/x:" + x/x);
        };

        consumer.accept(10);
    }
}

package io.functionalInterfaces;

import java.util.function.DoubleConsumer;

public class DoubleConsumerExample {
    public static void main(String[] args) {
        DoubleConsumer doubleConsumer = (dblConsumer) -> System.out.println(dblConsumer*20);
        doubleConsumer.accept(10.2);
    }
}

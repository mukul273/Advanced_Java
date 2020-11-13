package io.functionalInterfaces;

import java.util.function.LongConsumer;

public class LongConsumerExample {
    public static void main(String[] args) {
        LongConsumer longConsumer = (longConsumr) -> System.out.println(longConsumr * 10L);
        longConsumer.accept(10L);
    }
}

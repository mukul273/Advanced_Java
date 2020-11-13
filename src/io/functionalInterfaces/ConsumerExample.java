package io.functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = (x) -> {
            System.out.println(" String passed in:'"+ x + "' String length is:" + x.length());
        };
        consumer.accept("Consumer Interface demo");
    }
}

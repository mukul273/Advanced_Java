package io.functionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> integerBiConsumer = (io1, io2)-> {
            System.out.println("Adding two integers using BiConsumer:"+(io1+io2));
        };
        integerBiConsumer.accept(3,9);

        BiConsumer<Integer, String> mixedBiConsumer = (io1, io2)-> {
            System.out.println("Adding two mixed integers using BiConsumer:"+(io1+io2));
        };
        mixedBiConsumer.accept(3,"9");

        BiConsumer<String, String> stringBiConsumer = (io1, io2)-> {
            System.out.println("Adding two Strings using BiConsumer:"+(io1+io2));
        };
        stringBiConsumer.accept("3","9");

        BiConsumer<Double, String> mixedStringBiConsumer = (io1, io2)-> {
            System.out.println("Adding two mixed Strings using BiConsumer:"+(io1+io2));
        };
        mixedStringBiConsumer.accept(3.0,"9");
    }
}

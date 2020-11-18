package io.functionalInterfaces;

import java.util.function.Supplier;

public class SupplierInterfaceExample {
    public static void main(String[] args) {
        Supplier<Integer> integerSupplier = () -> (int) (Math.random() * 100);
        System.out.println(integerSupplier.get());
        System.out.println(integerSupplier.get());
    }
}

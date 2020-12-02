package io.eightplus;

public interface FirstInterface {
    default void sumA(int int1, int int2) {
        System.out.println("First Interface:"+(int1+int2));
    }
}

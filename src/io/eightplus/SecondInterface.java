package io.eightplus;

public interface SecondInterface extends FirstInterface{

    default void sumB(int num1, int num2) {
        System.out.println("Second Interface:"+(num1+num2));
    }

    default void sumA(int int1, int int2) {
        System.out.println("Second Interface:"+(int1+int2));
    }
}

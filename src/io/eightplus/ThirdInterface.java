package io.eightplus;

public interface ThirdInterface {

    default void sumC(int num1, int num2) {
        System.out.println("Third Interface:"+(num1+num2));
    }
}

package io.eightplus;

@FunctionalInterface // Because this interface has exactly one abstract method
public interface Calculator {

    //Abstract method
    public int sum(int num1, int num2);
    //public int division(int num1, int num2); // if uncommented then we will have to remove @FunctionalInterface will have to be removed

    //Default methods
    default int subtract(int num1, int num2){
        return num1 - num2;
    }

    // static method
    static int multiply(int num1, int num2) {
        return num1 * num2;
    }
}

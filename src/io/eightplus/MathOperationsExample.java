package io.eightplus;

public class MathOperationsExample implements Calculator {

    public static void main(String[] args) {
        MathOperationsExample mathOperationsExample = new MathOperationsExample();
        System.out.println("Sum: " + mathOperationsExample.sum(2,4));

        //Our implementation for sum and division using lambda
        Calculator calculator = (num1, num2) -> num1%num2;
        System.out.println("sum = " + calculator.sum(3,2));

        System.out.println("Subtract = " + mathOperationsExample.subtract(4,2));

        System.out.println("multiply = "+ Calculator.multiply(2,5));
    }

    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}

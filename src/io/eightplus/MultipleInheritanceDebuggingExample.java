package io.eightplus;

public class MultipleInheritanceDebuggingExample implements FirstInterface, FourthInterface {

    public void sumA(int num1, int num2) {
        System.out.println("It is impotant to understand that we will have override the same method in");
        System.out.println(" implementing class when one method is implemented in multiple interfaces ");
        System.out.println("implemented by the same class which is in this case. This is the only way.");
        System.out.println("MultipleInheritanceDebuggingExample:"+(num1+num2));
    }
}

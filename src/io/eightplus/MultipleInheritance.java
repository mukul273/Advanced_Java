package io.eightplus;

public class MultipleInheritance implements FirstInterface, SecondInterface, ThirdInterface {

    public static void main(String[] args) {
        MultipleInheritance multipleInheritance = new MultipleInheritance();
        multipleInheritance.sumA(4,8);
        multipleInheritance.sumB(1,2);
        multipleInheritance.sumC(2,4);
    }

    public void sumA(int num1, int num2) {
        System.out.println("MultipleInheritance:"+(num1+num2));
    }
}

package io.lambdaexpressions;

public class HelloWorldLambdaSimplified {
    
    public static void main(String[] args) {
        HelloWorldInterface helloWorldInterface = () -> "Simplified Hello World from Lambda World";
        System.out.println(helloWorldInterface.helloWorld());
    }
}

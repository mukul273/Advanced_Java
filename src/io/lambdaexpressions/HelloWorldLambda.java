package io.lambdaexpressions;

public class HelloWorldLambda {
    
    public static void main(String[] args) {
        HelloWorldInterface helloWorldInterface = () -> {
            return "Hello World from Lambda World";
        };
        System.out.println(helloWorldInterface.helloWorld());
    }
}

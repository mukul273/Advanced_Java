package io.lambdaexpressions;

public class HelloWorldOldWay implements HelloWorldInterface {
    
    
    @Override
    public String helloWorld() {
        return "Hello World, Welcome to Lambda Expressions";
    }
    
    public static void main(String[] args) {
        String s = new HelloWorldOldWay().helloWorld();
        System.out.println(s);
    }
}

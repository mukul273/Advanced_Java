package io.lambdaexpressions;

public class IncreamentByLambdaWay {
    public static void main(String[] args) {
        IncreamentBy increamentBy = (x) -> x+7;
        System.out.println(increamentBy.increamentBy(2));
    }
}

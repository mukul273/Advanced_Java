package io.lambdaexpressions;

public class ConcatLambdaWay {
    public static void main(String[] args) {
        ConcatenateInterface  concatenateInterface = (a,b) -> a.concat(b);
        System.out.println(concatenateInterface.sConcat("I am again", " a Chimp"));
    }
}

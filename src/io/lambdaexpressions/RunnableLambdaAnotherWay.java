package io.lambdaexpressions;

public class RunnableLambdaAnotherWay {
    public static void main(String[] args) {
        new Thread( () -> {
            int sum=0;
            for (int i=0; i<5; i++)
                sum += i;

            System.out.println(sum);
        }).start();
    }
}

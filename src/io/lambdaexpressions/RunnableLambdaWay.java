package io.lambdaexpressions;

public class RunnableLambdaWay {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            int sum=0;
            for (int i=0; i<5; i++)
                sum += i;

            System.out.println(sum);
        };
        new Thread(runnable).start();
    }
}

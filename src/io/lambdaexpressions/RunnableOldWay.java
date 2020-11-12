package io.lambdaexpressions;

public class RunnableOldWay {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i=0; i<5; i++)
                    sum += i;

                System.out.println(sum);
            }
        };
        new Thread(runnable).start();
    }
}

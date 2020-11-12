package io.lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class SumOfNumbersUsingCallableLambdaWay {
    public static int[] intArr = IntStream.rangeClosed(0,5000).toArray();
    public static int total = IntStream.rangeClosed(0,5000).sum();

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable callable = () -> {
            int sum=0;
            for(int i=0; i< intArr.length/2; i++)
                sum += intArr[i];

            return sum;
        };

        Callable callable1 = ()-> {
            int sum = 0;
            for(int i=intArr.length/2; i< intArr.length; i++)
                sum += intArr[i];

            return sum;
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Callable<Integer>> taskList = Arrays.asList(callable, callable1);

        List<Future<Integer>> results = executorService.invokeAll(taskList);

        int k=0;
        int sum = 0;

        for (Future<Integer> result: results) {
            sum += result.get();
            System.out.println("Sum of " + ++k + " is " + result.get());
        }
        System.out.println("Sum from Callable is:"+sum);
        System.out.println("Correct Sum from total is:"+total);

        System.out.println("Are equal: " + (sum == total));

        executorService.shutdown();
    }
}

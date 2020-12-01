package io.streams.parallelStreams;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class StreamPerformanceAnotherExample {

    static long tokenCount = 5000;

    public static void main(String[] args) {
        int loop = 20;
        long result = measurePerformance(StreamPerformanceAnotherExample::sortSequentialStream, loop);
        System.out.println("result = " + result);
        long result1 = measurePerformance(StreamPerformanceAnotherExample::sortParallelStream, loop);
        System.out.println("result = " + result1);
    }

    public static long sortSequentialStream() {
        List<RandomTokens> randomTokensList = LongStream.rangeClosed(0, tokenCount)
                .mapToObj((i) -> {
                    return new RandomTokens(i, ThreadLocalRandom.current().nextLong(tokenCount));
                }).collect(Collectors.toList());
        randomTokensList.stream().sorted(Comparator.comparing(RandomTokens::getTokens));
        return -1;
    }

    public static long sortParallelStream() {
        List<RandomTokens> randomTokensList = LongStream.rangeClosed(0, tokenCount)
                .parallel()
                .mapToObj((i) -> {
                    return new RandomTokens(i, ThreadLocalRandom.current().nextLong(tokenCount));
                }).collect(Collectors.toList());
        randomTokensList.stream().parallel().sorted(Comparator.comparing(RandomTokens::getTokens));
        return -1;
    }

    public static long measurePerformance(Supplier<Long> integerSupplier, int noOfTimes) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < noOfTimes; i++) {
            integerSupplier.get();
        }
        return System.currentTimeMillis() - startTime;

    }
}

class RandomTokens {
    long id;
    long tokens;

    public RandomTokens(long id, long tokens) {
        this.id = id;
        this.tokens = tokens;
    }

    public long getId() {
        return id;
    }

    public long getTokens() {
        return tokens;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTokens(long tokens) {
        this.tokens = tokens;
    }
}

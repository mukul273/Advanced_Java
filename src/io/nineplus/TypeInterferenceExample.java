package io.nineplus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TypeInterferenceExample {

    public static void main(String[] args) {
        //Before Java 10
        String name = "Mike";
        //Java 10
        var name1 = "Mike";
        System.out.println("name1 = " + name1);

        var dateTime = LocalDateTime.now();// Equivalent of
                                                          // LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("dateTime = " + dateTime);

        //Before Java 10
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();
        // Java 10
        var map = new HashMap<Integer, String>();

        //Before Java 10
        Integer[] integers = {1,2,3,4,5};
        // Java 10
        var numbers = new int[] {1,2,3,4,5};

        //Before Java 10
        List<String> nums = new ArrayList<>();
        nums.add("1");
        nums.add("2");
        nums.add("3");
        System.out.println("nums = " + nums);

        // Java 10
        var arr = new ArrayList<>();
        arr.add("1");
        arr.add("2");
        arr.add("3");
        arr.add(1);// This is allowed because arr has no type to infer
        System.out.println("arr = " + arr);

        var integerNums = List.of(1,2,3);
        integerNums.forEach(System.out::println);

        var result = 9/2;
        System.out.println("result = " + result);

        var resultD = 9.0/2;
        System.out.println("resultD = " + resultD);

        var resultDouble = 11d/2d;
        System.out.println("resultDouble = " + resultDouble);

        var test = "A blessing";
        print(test);
    }

    public static void print(String toPrint) {
        System.out.println("toPrint:"+toPrint);
    }
}

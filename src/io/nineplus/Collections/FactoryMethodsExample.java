package io.nineplus.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FactoryMethodsExample {

    public static void main(String[] args) {

        // Before Java 8+
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList = Collections.unmodifiableList(stringList);//This will make the list as unmodifiable
        System.out.println("stringList = " + stringList);
        //stringList.add("4"); // This line will throw Exception in thread "main" java.lang.UnsupportedOperationException

        // New Way
        List<String> numbers = List.of("4","1","2","3"); // This line creates the unmodifiable list OR Set OR Map
        System.out.println("numbers = " + numbers);
        //numbers.add("4"); // This line will throw Exception in thread "main" java.lang.UnsupportedOperationException
        //numbers.sort(Comparator.naturalOrder()); // This line will throw Exception in thread "main"
                                                    // java.lang.UnsupportedOperationException because we are not
                                                    // allowed to even modify the collection
    }
}

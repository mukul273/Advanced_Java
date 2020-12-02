package io.eightplus;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DefaultStaticExample {

    public static void main(String[] args) {
        // Old ways to sort String with natural order
        List<String> names = Arrays.asList("9","1","2","8","3","4");
        //Collections.sort(names);
        //System.out.println("names = " + names);

        //new ways
        names.sort(Comparator.naturalOrder());
        System.out.println("names = " + names);
    }
}

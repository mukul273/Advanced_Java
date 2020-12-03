package io.nineplus.improvements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class TryWithResourcesExample {

    public static void main(String[] args) throws IOException {

        // Java 8
        Reader reader = new StringReader("Cutting Corners not possible");
        BufferedReader bufferedReader = new BufferedReader(reader);
        try(BufferedReader bufferedReader1 = bufferedReader) {
            System.out.println(bufferedReader1.readLine());
        }

        //New Way Java 9
        Reader reader1 = new StringReader("New Way Cutting Corners not possible");
        BufferedReader newBufferedReader = new BufferedReader(reader1);
        try (newBufferedReader) {
            System.out.println("newBufferedReader = " + newBufferedReader.readLine());
        }
    }
}

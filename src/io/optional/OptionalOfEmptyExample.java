package io.optional;

import java.util.Optional;

public class OptionalOfEmptyExample {

    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.of("This is empty");
        System.out.println("stringOptional = " + stringOptional.get());

        System.out.println("getString(): "+ getString());
        System.out.println("getString(): "+ getString().get());
    }

    public static Optional<String> getString() {
        String[] strs = new String[10];
        //Comment below line for another empty use case
        strs[1] = "This might not be empty";
        Optional<String> stringOptional = Optional.ofNullable(strs[1]);
        if(stringOptional.isPresent())
            return stringOptional;
        else
            return Optional.empty();
    }
}

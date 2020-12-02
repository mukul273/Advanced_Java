package io.optional;

import java.util.Optional;

public class OptionalIfIsPresentExample {

    public static void main(String[] args) {

        //Use Case - ifPresent
        Optional<String> stringOptional = Optional.ofNullable("is Nullable");

        if(stringOptional.isPresent())
            System.out.println("stringOptional = " + stringOptional);

        //Another use case ifPresent
        stringOptional.ifPresent(s -> System.out.println("s = " + s));
    }
}

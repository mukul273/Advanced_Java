package io.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsVsCollections {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("ListItem1");
        names.add("ListItem2");
        names.add("ListItem3");
        names.add("ListItem4");
        System.out.println(names);

        names.remove("ListItem2");
        System.out.print("Collection Item removal:");
        System.out.println(names);

        //External traversing
        for(String name:names) {
            System.out.println(name);
        }

        System.out.println("Stream Demo");
        //Stream<String> stream = new Stream<String>("String1"); // This won't work because Stream is an abstract class
        Stream<String> namesStream = names.stream();

        //Internal Traversing
        System.out.println("Internal traversing of the stream...");
        namesStream.forEach(System.out::println);
        //namesStream.forEach(System.out::println); //This will produce the runtime exception like this
        //Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
        //	at java.base/java.util.stream.AbstractPipeline.sourceStageSpliterator(AbstractPipeline.java:279)
        //	at java.base/java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:658)
        //	at io.streams.StreamsVsCollections.main(StreamsVsCollections.java:33)

        System.out.println("Demo of lazy instantiation");
        Stream<String> count = names.stream().filter(s->s.startsWith("M"));
        System.out.println("Count:"+count.count());//Still the count is zero because Stream is not created and finalized
        List<String> collect = names.stream().filter(s->s.startsWith("M")).collect(Collectors.toList());
        System.out.println(collect);
    }
}

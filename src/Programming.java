import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Programming {
    public static void main(String[] args) {
    
        System.out.println("Imperative Programming");
        
        for (int i=0; i<10; i++) {
            System.out.print(i);
        }
    
        System.out.println("\nDeclarative Programming example");
        IntStream numbers = IntStream.of(1,2,3,4,5);
        numbers.forEach(System.out::print);
    
        System.out.println("\nAnother Declarative Programming example");
        IntStream numbersRange = IntStream.rangeClosed(1,5);
        numbersRange.forEach(System.out::print);
        
        System.out.println("\nAnother Declarative Programming example");
        int numbersSum = IntStream.of(1,2,3,4,5).sum();
        System.out.println(numbersSum);
    
        System.out.println("\nAnother Declarative Programming example");
        int numbersRangeSum = IntStream.rangeClosed(1,5).sum();
        System.out.println(numbersRangeSum);
    
        System.out.println("\nAnother Declarative Programming example");
        List<Integer> numbersList= Arrays.asList(2,3,4,5,1);
        System.out.println(numbersList.stream().min(Integer::compareTo));
    
    
        System.out.println("\nAnother Declarative Programming example");
        List<String> strList= Arrays.asList("me", "you","no one");
        System.out.println(strList.stream().sorted().max(String::compareTo));
        
    }
}

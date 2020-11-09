import java.util.stream.IntStream;

public class Programming {
    public static void main(String[] args) {
    
        System.out.println("Imperative Programming");
        
        for (int i=0; i<10; i++) {
            System.out.print(i);
        }
    
        System.out.println("\nDeclarative Programming");
        IntStream numbers = IntStream.of(1,2,3,4,5);
        numbers.forEach(System.out::print);
    
        System.out.println("\nAnother Declarative Programming");
        IntStream numbersRange = IntStream.rangeClosed(1,5);
        numbersRange.forEach(System.out::print);
        
    }
}

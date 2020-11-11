package io.lambdaexpressions;

public class ConcatOldWay implements ConcatenateInterface {
    
    @Override
    public String sConcat(String first, String second) {
        return first.concat(second);
    }
    
    public static void main(String[] args) {
        String s = new ConcatOldWay().sConcat("I am ", "Chimp");
        System.out.println(s);
    }
}

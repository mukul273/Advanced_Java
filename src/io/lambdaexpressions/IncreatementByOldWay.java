package io.lambdaexpressions;

public class IncreatementByOldWay implements IncreamentBy {
    
    public static void main(String[] args) {
        int i = new IncreatementByOldWay().increamentBy(5);
        System.out.println(i);
    }
    
    @Override
    public int increamentBy(int param) {
        return param+5;
    }
}

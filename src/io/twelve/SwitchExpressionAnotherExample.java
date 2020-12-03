package io.twelve;

public class SwitchExpressionAnotherExample {

    public static void main(String[] args) {
        String month = "March";
        switch(month) {
            case "Jan","Feb", "March" -> System.out.println("First Qtr");
            case "Apr", "May","June" -> System.out.println("Second Qtr");
            case "July", "Aug", "Sept" -> System.out.println("Third Qtr");
            case "Oct", "Nov", "Dec" -> System.out.println("Fourth Qtr");
            default -> System.out.println("Unknown");
        };
    }
}

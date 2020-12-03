package io.twelve;

public class SwitchExpressionExample {

    public static void main(String[] args) {
        String month = "March";
        String qtr = switch(month) {
            case "Jan","Feb", "March" -> "First Qtr";
            case "Apr", "May","June" -> "Second Qtr";
            case "July", "Aug", "Sept" -> "Third Qtr";
            case "Oct", "Nov", "Dec" -> "Fourth Qtr";
            default -> "Unknown";
        };
        System.out.println("qtr = " + qtr);

    }
}

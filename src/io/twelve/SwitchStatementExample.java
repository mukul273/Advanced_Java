package io.twelve;

public class SwitchStatementExample {

    public static void main(String[] args) {
        String month = "March";
        String qtr ="";
        switch(month){
            case "Jan":
                qtr = "First";
                break;
            case "Feb":
                qtr = "First";
                break;
            case "March":
                qtr = "First";
                break;
            case "Apr":
                qtr = "Second";
                break;
            case "May":
                qtr = "Second";
                break;
            case "June":
                qtr = "Second";
                break;
            case "July":
                qtr = "Third";
                break;
            case "Aug":
                qtr = "Third";
                break;
            case "Sept":
                qtr = "Third";
                break;
            case "Oct":
                qtr = "Fourth";
                break;
            case "Nov":
                qtr = "Fourth";
                break;
            case "Dec":
                qtr = "Fourth";
            default:
                qtr = "Unknown";
                break;
        }
        System.out.println("qtr = " + qtr);
    }
}

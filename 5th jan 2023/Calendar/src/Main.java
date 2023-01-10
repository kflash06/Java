import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Months number ");
        int n = sc.nextInt();
        String month;
        switch (n) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "october";
                break;
            case 11:
                month = "november";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "There are 12 months in a calendar year, choose between 1 - 12";
                break;
        }
        System.out.println("There are " + DaysInMonth.getDaysInMonth(n, 2021) + " days in " + month);
    }
}
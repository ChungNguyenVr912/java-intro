import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args){
        System.out.println("Days in month");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month: ");
        int month = scanner.nextInt();
        String daysInMonth = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> "31";
            case 2 -> "28 or 29";
            case 4, 6, 9, 11 -> "30";
            default -> "";
        };
        if(!daysInMonth.equals("")){
            System.out.printf("The month %d has %s days", month, daysInMonth);
        }else {
            System.out.println("Invalid input!");
        }
    }
}

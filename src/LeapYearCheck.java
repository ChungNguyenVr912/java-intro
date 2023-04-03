import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args){
        System.out.println("LEAP YEAR CHECK:");
        Scanner scanner = new Scanner(System.in);
        long year = scanner.nextLong();
        boolean isLeapYear;
        if(year % 400 == 0){
            isLeapYear = true;
        }else if (year % 100 == 0){
            isLeapYear = false;
        } else if (year % 4 == 0) {
            isLeapYear = true;
        }else {
            isLeapYear = false;
        }
        if(isLeapYear){
            System.out.printf("%d is leap year \n", year);
        }else {
            System.out.printf("%d is not leap year\n", year);
        }
    }
}

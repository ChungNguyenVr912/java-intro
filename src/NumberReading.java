import java.util.Scanner;

public class NumberReading {
    public static String oneDigit(int number){
        String s = switch (number) {
            case 0 -> "";
            case 1 ->  "one";
            case 2 ->  "two";
            case 3 ->  "three";
            case 4 ->  "four";
            case 5 ->  "five";
            case 6 ->  "six";
            case 7 ->  "seven";
            case 8 ->  "eight";
            case 9 ->  "nine";
            default -> "invalid";
        };
        return s;
    }

    public static String twoDigit(int number){
        int tens = number/10;
        int units = number%10;
        String result;
        if(number <= 20) {
            switch (number) {
                case 10 -> result = "ten";
                case 11 -> result = "eleven";
                case 12 -> result = "twelve";
                case 13 -> result = "thirteen";
                case 15 -> result = "fifteen";
                case 18 -> result = "eighteen";
                case 20 -> result = "twenty";
                default -> result = oneDigit(units) + "teen";
            }
        }else {
            switch (tens){
                case 2 -> result = "twenty " + oneDigit(units);
                case 3 -> result = "thirty " + oneDigit(units);
                case 4 -> result = "forty " + oneDigit(units);
                case 5 -> result = "fifty " + oneDigit(units);
                case 8 -> result = "eighty " + oneDigit(units);
                default -> result = oneDigit(tens) + "ty " + oneDigit(units);
            }
        }
        return result;
    }

    public static String threeDigits(int number){
        int hundred = number/100;
        int tens = number%100;
        String result;
        if(tens == 0){
            result = oneDigit(hundred) + " hundred";
        }else if(tens < 10){
            result = oneDigit(hundred) + " hundred and " + oneDigit(tens);
        }else {
            result = oneDigit(hundred) + " hundred and " + twoDigit(tens);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.print("Enter number u want to read: ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        if (inputNumber < 10 && inputNumber > 0) {
            System.out.println(oneDigit(inputNumber));
        }else if (inputNumber < 100){
            System.out.println(twoDigit(inputNumber));
        } else if (inputNumber < 1000) {
            System.out.println(threeDigits(inputNumber));
        }else {
            System.out.println("out of ability");
        }
    }
}

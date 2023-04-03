import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args){
        System.out.println("Currency Convert:");
        System.out.println("Input USD");
        Scanner scanner = new Scanner(System.in);
        float usd = scanner.nextFloat();
        float vnd = usd * 23000;
        System.out.printf("%.1f USD = %.1f VND", usd, vnd);
    }
}

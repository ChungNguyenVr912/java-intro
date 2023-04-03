import java.util.Scanner;

public class CheckBMI {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your weight in kg: ");
        double weight = scanner.nextDouble();
        System.out.print("Input your height in cm: ");
        double height = scanner.nextDouble();
        double bmi = weight/(height*height/10000);
        if(bmi < 18.5){
            System.out.println("U are under weight");
        }else if(bmi < 25){
            System.out.println("U are normal");
        }else if(bmi < 30){
            System.out.println("U are overweight");
        }else {
            System.out.println("U are obese");
        }
    }
}

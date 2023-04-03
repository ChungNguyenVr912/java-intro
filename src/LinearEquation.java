import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args){
        System.out.println("Giai phuong trinh bac 1: y = a.x + b");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter y: ");
        double y = scanner.nextDouble();
        if(a != 0){
            double answer = (y - b)/a;
            System.out.printf("Nghiem cua pt: x = %f\n", answer);
        }else if(y == b){
            System.out.println("Phuong trinh dung voi moi gia tri cua x");
        }else {
            System.out.println("Pt vo nghiem!");
        }
    }
}

import java.util.Scanner;

/**
 * Created by NastyaY on 10.03.2015.
 */
public class NewClass {

    public static void quadraticEquation() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = input.nextInt();
        if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0, введите другое знаечение: ");
            a = input.nextInt();
        }
        System.out.println("Enter b:");
        int b = input.nextInt();
        System.out.println("Enter c:");
        int c = input.nextInt();
        double d = (Math.pow(b, 2) - 4 * a * c);
        if (d < 0) {
            System.out.println("Нет действитльных решений уравнения");
        } else {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println(x1 + ", " + x2);
        }
    }


}

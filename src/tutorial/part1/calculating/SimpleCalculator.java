package tutorial.part1.calculating;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter second number: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / num2));    //double type cast for 1 integer results in float quotient (no need to type cast both)
    }
}

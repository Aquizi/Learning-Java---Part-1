package tutorial.part2.loops;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numbersRead = 0;
        int sum = 0;

        while (numbersRead != 5) {

            System.out.println("Input number: ");
            sum = sum + Integer.parseInt(scanner.nextLine());
            numbersRead = numbersRead + 1;
        }
        System.out.println("The sum of the numbers is " + sum);
    }
}

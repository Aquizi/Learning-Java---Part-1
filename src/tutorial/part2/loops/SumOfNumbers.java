package tutorial.part2.loops;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while(true){
            System.out.println("Enter number (0 to exit): ");
            int num = Integer.parseInt(scanner.nextLine());

            if (num == 0) {
                break;
            }

            sum = sum + num;
        }
        System.out.println("Total: " + sum);
    }
}

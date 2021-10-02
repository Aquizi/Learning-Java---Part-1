package tutorial.part2.loops;
import java.util.Scanner;

public class OnlyPositives {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Enter number: ");
            int num = Integer.parseInt(scanner.nextLine());

            if (num == 0 ){
                break;
            }

            if (num < 0){
                System.out.println("Unsuitable number! Try again.");
                continue;
            }

            System.out.println(num * num);
        }
        System.out.println("Goodbye!");
    }
}

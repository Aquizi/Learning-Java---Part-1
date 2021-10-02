package tutorial.part2.loops;
import java.util.Scanner;

public class Continue {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Insert positive integers");
            int number = Integer.parseInt(scanner.nextLine());

            if (number == 0){
                break;
            }

            if (number < 0){
                System.out.println("Unfit number! Try again.");
                continue;       //  moves to start of loop, ignores any remaining code below
            }
            System.out.println("Your input was " + number);
        }
    }
}

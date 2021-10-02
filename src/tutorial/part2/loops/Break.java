package tutorial.part2.loops;
import java.util.Scanner;

public class Break {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Enter a number: ");
            int num = Integer.parseInt(scanner.nextLine());
            if(num == 4){
                System.out.println("You got it!");
                break;      //  ends the loop and executes the next line of code after loop
            }
            System.out.println("Try again!");
        }
        System.out.println("Goodbye!");
    }
}

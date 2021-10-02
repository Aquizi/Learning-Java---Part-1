package tutorial.part2.loops;
import java.util.Scanner;

public class UsingVariableOutsideLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //  The task is to keep track of number ones

        //  Create OUTSIDE of loop
        int ones = 0;

        //  The task is to read an input from the user
        while(true){
            System.out.println("Give a number (end with 0): ");
            //  The task is to read a user inputted number
            int number = Integer.parseInt(scanner.nextLine());

            //  The task is to exit the loop if the user has inputted zero
            if (number == 0) {
                break;
            }

            //  The task is to increase the amount of ones if the user inputs a number one
            if (number == 1) {
                ones++;
            }
        }
        //  The task is to print out the total of ones
        //  Ones variable can be referenced OUTSIDE of loop
        System.out.println("The total of ones: " + ones);
    }
}

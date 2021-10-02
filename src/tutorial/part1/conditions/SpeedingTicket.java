package tutorial.part1.conditions;
import java.util.Scanner;

public class SpeedingTicket {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter speed: ");
        int speed = Integer.parseInt(scanner.nextLine());
        if(speed > 120){
            System.out.println("SPEEDING!");
        }
        else{
            System.out.println("Under the limit.");
        }
    }
}

package tutorial.calculating;
import java.util.Scanner;

public class SecondsInDay {
    static public void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of days: ");
        int days = Integer.parseInt(scanner.nextLine());

        String Seconds = String.valueOf(days * 24 * 60 * 60);
        System.out.println("There are " + Seconds + " seconds in " + days + " day(s).");
    }
}

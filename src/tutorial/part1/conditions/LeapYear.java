package tutorial.part1.conditions;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = Integer.parseInt(scanner.nextLine());
        if(year % 4 != 0){
            System.out.println(year + " is not a leap year.");
        }
        else if(year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " is a leap year.");
            }
            else{
                System.out.println(year + " is not a leap year.");
            }
        }
            else{
            System.out.println(year + " is a leap year.");
        }
    }
}
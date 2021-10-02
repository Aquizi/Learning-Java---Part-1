package tutorial.part1.variables;

import java.util.Scanner;

public class ReadingVariables {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter some text: ");
        String text = scanner.nextLine();

        System.out.print("Enter a whole number: ");
        int wholeNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter a decimal number: ");
        double decimalNumber = Float.parseFloat(scanner.nextLine());

        System.out.print("Enter true or false: ");
        boolean trueFalse = Boolean.parseBoolean(scanner.nextLine());

        System.out.println();
        System.out.println("String: " + text);
        System.out.println("int: " + wholeNumber);
        System.out.println("double: " + decimalNumber);
        System.out.println("Boolean: " + trueFalse);
    }
}

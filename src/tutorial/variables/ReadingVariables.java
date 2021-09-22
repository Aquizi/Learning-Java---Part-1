package tutorial.variables;

import java.util.Scanner;

public class ReadingVariables {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a value: ");
        int value = Integer.parseInt(scanner.nextLine());
        System.out.println("You wrote " + value);

    }
}

package tutorial.part1.calculating;

public class Division {
    public static void main(String[] args){
        int first = 3;
        int second = 2;

        double result1 = (double) first/second;     //type casting converts "first" integer to float
        System.out.println(result1);                //prints 1.5

        double result2 = first/ (double) second;    //type casting converts "second" integer to float
        System.out.println(result2);                //prints 1.5

        double result3 = (double) (first/second);   //type casting converts both integers to float
        System.out.println(result3);                //prints 1.0
    }
}

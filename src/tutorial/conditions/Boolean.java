package tutorial.conditions;

public class Boolean {
    public static void main(String[] args){
        int first = 1;
        int second = 3;

        boolean isItLessThan = first < second;      //stores the evaluation of the comparison in a Boolean variable (isItLessThan = True)

        if (isItLessThan) {                         //isItLessThan = True
            System.out.println("1 is less than 3!");
        }
        else {
            System.out.println("1 is not greater than 3!");
        }
    }
}

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

        isNumber(9);
        isNumber(-100);
        isNumber(0);

    }
    private static void isNumber(int checkInteger) {
    // Condition for if input is positive
        if(checkInteger > 0){
            System.out.println(checkInteger + " " + "is" + " " + "Positive");
    // Condition for if input is Negative
        }else if(checkInteger < 0){
            System.out.println(checkInteger + " " + "is" + " " + "Negative");
    // Condition for if input is Zero
        }else {
            System.out.println(checkInteger + " " + "is" + " " + "Zero");
        }
    }
}

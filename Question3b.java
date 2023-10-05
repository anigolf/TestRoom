import java.util.Scanner;

public class Question3b {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Input: ");

        char character = scanner.next().charAt(0);
        System.out.println(isAsciiValue(character));

        char character2 = scanner.next().charAt(0);
        System.out.println(isAsciiValue(character2));

    }

    private static int isAsciiValue(char character){

        int ascii = character;
        System.out.println("The ASCII Value of " + character + " is " + ascii);
        return ascii;
    }


}

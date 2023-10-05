
import java.util.Scanner;

public class Question4B {
//FIBONACCI SERIES
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Input: ");

        int n = scanner.nextInt();
        System.out.println(displayFibonacciSeries(n));

    }

    private static int displayFibonacciSeries(int n){

//  To create the fibonacci Series
        for(int i = 0; i <= n; i++){
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        System.out.print("That's the Fibonacci of: ");
        return n;
    }
    private static long fibonacci(int n) {
//  To define the first 2 numbers of the fibonacci series
        if(n <= 1){
            return n;
        }
//  Fibonacci is defined as (n-1) + (n-2)
        return (fibonacci(n-1) + fibonacci(n-2));
    }
}

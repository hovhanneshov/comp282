package divisibility;
import java.util.Scanner;

//This program reads in two numbers from the user, dividend and divisor, and prints out whether dividend is evenly divisible by divisor.
//
// For example, one run of the program may look like this:
//
//Enter the dividend: 10
//Enter the divisor: 5
//10 is divisible by 5!
//
//Because 5 goes into 10 twice. 10 is evenly divisible by 5.

//Your program should be able to produce the following output:
//
//Enter the dividend: 10
//Enter the divisor: 0
//10 is not divisible by 0


public class Divisibility {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int dividend = input.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();
        if(divisor == 0)
            System.out.print(dividend + " is not divisible by " + divisor);
        else if(dividend % divisor != 0)
            System.out.print(dividend + " is not evenly divisible by " + divisor);
        else
            System.out.print(dividend + " is evenly divisible by " + divisor);
    }
}

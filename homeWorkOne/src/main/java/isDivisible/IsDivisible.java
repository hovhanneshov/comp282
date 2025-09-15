package isDivisible;
import java.util.Scanner;

//Write a method that returns whether a is divisible by b.
//
//Your method signature should be
//
//public boolean isDivisible(int a, int b)

public class IsDivisible {

  public static boolean isDivisible(int a, int b){
    if(b == 0)
      return false;
    else if(a % b == 0)
      return true;
    else
      return false;
  }
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a dividend: ");
    int dividend = input.nextInt();
    System.out.print("Enter a divisor: ");
    int divisor = input.nextInt();
    System.out.print(isDivisible(dividend, divisor));
  }
}

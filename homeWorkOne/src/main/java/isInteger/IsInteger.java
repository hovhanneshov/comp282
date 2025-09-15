package isInteger;
import java.util.Scanner;

public class IsInteger {

//    Given a string, determine if it is an integer. For example the
//    string “123” is an integer, but the string “hello” is not.
//
//    It is an integer if all of the characters in the string are digits.
//
//    Return true if it is an integer, or false if it is not.
//
  public static boolean isInteger(String text){
    for(int i = 0; i < text.length(); i++){
      int character = text.charAt(i) - '0'; // Converts char to int
      if(character < 0 || character > 9) // Checks if the number is a decimal digit from 0-9, otherwise is not an int character
        return false;
    }
    return true;
  }
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a string to determine if its an int or not.");
    String s = input.nextLine();
    System.out.println(isInteger(s));
  }
}

package threeStrings;
import java.util.Scanner;
//Write a program that asks the user for three strings.
//
//Then, print out whether the first string
//concatenated to the second string is equal to the
//third string. Here are a few sample program runs:
//
//Sample Program 1:
//
//First string? pepper
//Second string? mint
//Third string? peppermint
//pepper + mint is equal to peppermint!
//Sample Program 2:
//
//First string? go
//Second string? fish
//Third string? donuts
//go + fish is not equal to donuts!

public class ThreeStrings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First string? ");
        String s1 = input.nextLine();
        System.out.print("Second string? ");
        String s2 = input.nextLine();
        System.out.print("Third string? ");
        String s3 = input.nextLine();
        if((s1 + s2).equals(s3))
            System.out.print(s1 + " + " + s2 + " is equal to " + s3 + "!");
        else
            System.out.print(s1 + " + " + s2 + " is not equal to " + s3 + "!");
    }
}

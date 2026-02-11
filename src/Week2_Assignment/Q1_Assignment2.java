package Week2_Assignment;/*
. Write a Java program that:
• Takes two integers from the user.
• Performs division of the first number by the second.
• Handles the following exceptions: -
o ArithmeticException (division by zero)
o InputMismatchException (non-integer input) -
o Uses multiple catch blocks and a finally block to print: “Program execution
completed”.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1_Assignment2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a= sc.nextInt();
        System.out.println("enter second number");
        int b= sc.nextInt();

        try{
            float divide=a/b;
            System.out.println(divide);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(InputMismatchException e){
            System.out.println();
        }
        finally{
            System.out.println("Program Execution Completed!");
        }

    }
}
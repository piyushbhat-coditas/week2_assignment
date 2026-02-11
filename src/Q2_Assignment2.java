/*
Create a custom runtime exception called InvalidAgeException.
• Throw this exception if age is less than 18 while creating a User object.
• Catch the exception and print a meaningful error message.
• Demonstrate why this exception is treated as a runtime exception.
 */


import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2_Assignment2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age:");

        try{
            int age=sc.nextInt();
            if(age<18){
                throw new InputMismatchException("InvalidAgeException");
            }
        }
        catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }
}
package Java_Collections;
import java.util.Stack;
public class StackDemo{
    public static void main(String[] args){

        Stack<String> name = new Stack<>(); //creating a stack
        name.push("Piyush"); //adding or pushing elements into stack.
        name.push("bhat");
        name.push("Piyush");
        name.push("kere");
        name.push("Piyush Bhat");
        System.out.println(name);//print all elements inside stack

        System.out.println(name.peek()); //returns topmost element in stack


        name.pop(); //it will remove the topmost element
        System.out.println(name);
    }
}
//operations in stack are : push, pop and peek
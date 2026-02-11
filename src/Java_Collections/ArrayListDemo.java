package Java_Collections;
import java.util.ArrayList;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args){

//Creating ArrayList and adding 1st string element in it.
//        ArrayList<String> name = new ArrayList<>();
//        name.add("Piyush Bhat");
//        System.out.println(name);


//Creating integer arraylist and adding multiple elements using add function.
        List<Integer> age = new ArrayList();
        age.add(19);
        age.add(20);
        age.add(38);
//        System.out.println(age);

        age.add(45);   //this will add age at the end of the array.
//        System.out.println(age);


//Adding elements at specific position using add function.
//        age.add(2,24);
//        System.out.println(age);

        List<Integer> newList = new ArrayList();
        newList.add(123);
        newList.add(500);

        age.addAll(newList);  //this will print all elements of previous age list and newList together in the previously created list object.
//        System.out.println(age);


//        System.out.println(age.get(4));// this will return the element at that index.
//        System.out.println(newList.get(1));


        age.remove(1); //this will simply remove the element at index 1.
//        System.out.println(age);

        age.remove(Integer.valueOf(38)); //this will also remove element directly which we specify.
//        System.out.println(age);

//        age.clear();  //this will remove all the elements in the array.
//        System.out.println(age);

        
        
        //Ways to iterate ArrayList

        //using for loop

        for(int i=0;i<age.size();i++){
            System.out.println(age.get(i));
        }

        //usin for each loop

        for(Integer element: age){
            System.out.println(element);
        }

        //using Iterator

        Iterator <Integer> it = age.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}

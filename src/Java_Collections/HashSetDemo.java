package Java_Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args){
        Set<Integer> hs = new HashSet<>();

        hs.add(120);
        hs.add(120); //it contains only unique element. 120 stored only once.
        hs.add(12);
        hs.add(47);
        System.out.println(hs);

        hs.remove(120);
        System.out.println(hs);

        System.out.println(hs.contains(12345)); //return false

        System.out.println(hs.isEmpty());//return true or false.  //false
        System.out.println(hs.size()); //2
    }
}

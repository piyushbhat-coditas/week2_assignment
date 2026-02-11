package Q9_Assignment2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Employee{

    public static void main(String[] args) {

        // HashMap
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(101, "Piyush");
        hm.put(102, "Prajwal");
        hm.put(103, "Arhaan");
        hm.put(104, "Sada");
        hm.put(105, "Kiran");

        for (Integer key : hm.keySet()) {
            System.out.println(key + " = " + hm.get(key));
        }

        System.out.println();

        // LinkedHashMap
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();

        lhm.put(105, "Piyush");
        lhm.put(102, "Prajwal");
        lhm.put(104, "Arhaan");
        lhm.put(103, "Sada");
        lhm.put(101, "Kiran");

        System.out.println("LinkedHashMap Output:");
        for (Integer key : lhm.keySet()) {
            System.out.println(key + " = " + lhm.get(key));
        }

        System.out.println();

        // TreeMap
        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(104, "Piyush");
        tm.put(102, "Prajwal");
        tm.put(103, "Arhaan");
        tm.put(101, "Sada");
        tm.put(105, "Kiran");

        System.out.println("TreeMap Output:");
        for (Integer key : tm.keySet()) {
            System.out.println(key + " = " + tm.get(key));
        }
    }
}


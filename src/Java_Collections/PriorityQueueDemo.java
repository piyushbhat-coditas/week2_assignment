package Java_Collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(20);
        pq.offer(88);
        pq.offer(45);
        pq.offer(67);

        System.out.println(pq); //it will print in order of Min Heap,[20, 67, 45, 88]
        pq.poll(); //it will remove the first element.
        System.out.println(pq);

        pq.peek(); //it will return the element which is next to remove
        System.out.println(pq);
    }

}

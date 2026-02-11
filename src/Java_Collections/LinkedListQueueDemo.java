package Java_Collections;
import java.util.LinkedList;
import java.util.Queue;
public class LinkedListQueueDemo {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(25); //it will add the element in queue
        queue.offer(22);
        queue.offer(47);
        queue.offer(69);
        System.out.println(queue); //[25, 22, 47, 69]

        System.out.println(queue.poll()); //poll() will remove the first element. i.e: 25
        System.out.println(queue);

        System.out.println(queue.peek()); //it gives which is next element to remove.

        queue.add(12);
        System.out.println(queue);



    }
}

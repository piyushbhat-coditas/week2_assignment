package Java_Collections;
import java.util.ArrayDeque;
public class ArrayDequeueDemo {
    public static void main(String[] args){
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.offer(24);
        ad.offer(56);
        ad.offer(15);
        ad.offerFirst(5);
        ad.offerLast(100);
        System.out.println(ad);

        //similarly for peek, peekFirst, peekLast, poll, pollFirst, pollLast
    }
}

package First;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;
public class LearnDequeue {
    public static void main(String args[])
    {
        ArrayDeque<Integer> pq=new ArrayDeque<>();
        pq.offer(40);
        pq.offer(89);
        pq.offer(78);
        pq.offer(55);
        pq.offer(10);
        pq.offer(79);
        pq.offer(68);
        pq.offer(45);
        System.out.println("Queue :-"+pq);
        System.out.println(pq.peek());
        System.out.println("Queue :-"+pq);
        System.out.println("Queue :-"+pq.poll());
        System.out.println(pq.peek());
        System.out.println("Queue :-"+pq);
        pq.offerFirst(11);
        pq.offerLast(57);
        System.out.println(pq.peek());
        System.out.println(pq.peekFirst());
        System.out.println("Queue :-"+pq);
        System.out.println(pq.peekLast());
        System.out.println("Queue :-"+pq);
        System.out.println(pq.poll());
        System.out.println("Queue :-"+pq);
        System.out.println(pq.pollFirst());
        System.out.println("Queue :-"+pq);
        System.out.println(pq.pollLast());
    }
}

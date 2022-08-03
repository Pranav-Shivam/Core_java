package First;

import java.util.Comparator;
import java.util.Queue;
import java.util.PriorityQueue;
public class LearnPriorityQueue
{
    public static void main(String args[])
    {
        Queue<Integer> pq=new PriorityQueue<>();
        pq.offer(40);
        pq.offer(89);
        pq.offer(78);
        pq.offer(55);
        pq.offer(12);
        System.out.println("Queue :-"+pq);
        System.out.println(pq.peek());
        System.out.println("Queue :-"+pq);
        System.out.println("Queue :-"+pq.poll());
        System.out.println(pq.peek());
        System.out.println("Queue :-"+pq);
        Queue<Integer> pq1=new PriorityQueue<>(Comparator.reverseOrder());
        pq1.offer(40);
        pq1.offer(89);
        pq1.offer(78);
        pq1.offer(55);
        System.out.println("Queue :-"+pq1);
        System.out.println(pq1.peek());
        System.out.println("Queue :-"+pq1);
        System.out.println("Queue :-"+pq1.poll());
        System.out.println(pq1.peek());
        System.out.println("Queue :-"+pq1);
    }
}

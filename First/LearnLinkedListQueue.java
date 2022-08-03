package First;

import java.util.Queue;
import java.util.LinkedList;
public class LearnLinkedListQueue {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12);
        queue.offer(24);
        queue.offer(2);
        queue.offer(4);
        queue.offer(21);
        queue.offer(29);
        System.out.println("Queue :-"+queue);
        System.out.println(queue.peek());
        System.out.println("Queue :-"+queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.element());
    }
}

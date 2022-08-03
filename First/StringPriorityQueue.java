package First;

import java.util.*;

public class StringPriorityQueue {
    public static void main(String[] args) {
        CompareString comp=new CompareString();
        PriorityQueue<String> queue=new PriorityQueue<>(10,comp);
        queue.add("Shivam");
        queue.offer("Pranav");
        queue.offer("Tomar");
        queue.offer("Maa");
        System.out.println(queue);
    }
}
class CompareString implements Comparator<String>
{
    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
}

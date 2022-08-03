package First;

import java.util.List;
import java.util.*;

public class CA9 {
    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        CA9 c = new CA9();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of node of Linked List");
        int n = sc.nextInt();
        while (n-- != 0) {
            System.out.println("Enter the element ");
            int ele = sc.nextInt();
            c.addList(ele);
        }
        c.printList();
        c.countSubpart();
    }

    public static void addList(int ele) {
        Node newNode = new Node(ele);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public static void printList() {
        if (head == null) {
            System.out.println("Linked list is empty : ");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " > ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void countSubpart() {
        List<Integer> li = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        Node temp = head;
        while (temp != null) {
            li.add(temp.data);
            temp = temp.next;
        }

        for (int j = 0; j < li.size(); j++) {
            int x = li.get(j);
            if (x % 2 == 0) {
                st.push(x);
            } else {
                while (!st.isEmpty()) {

                    System.out.print(st.pop() + " > ");

                }
                System.out.print(x + " > ");
            }

        }
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
        System.out.println("\n");
        System.out.println(li);
    }
}

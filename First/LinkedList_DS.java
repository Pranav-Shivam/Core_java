package First;

import java.util.Scanner;
public class LinkedList_DS
{
    public static Node head=null;
    public static Node tail=null;
    public static void main(String[] args)
    {
        LinkedList_DS l1=new LinkedList_DS();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the List :-");
        int l=sc.nextInt();
        int key;
        System.out.println("Enter element");
        while (l-- !=0)
        {
            int ele=sc.nextInt();
            l1.addNode(ele);
        }
        l1.printList();
        System.out.println("Add at beg ");
        key= sc.nextInt();
        l1.addAtBeg(key);
        l1.printList();
        System.out.println("Add at last ");
        key= sc.nextInt();
        l1.append(key);
        l1.printList();
        System.out.println("Add at given position ");
        key= sc.nextInt();
        l1.addAtPos(head,key);
        System.out.println("Deleting the key ");
        key= sc.nextInt();
        l1.deleteNode(key);
        l1.printList();
        System.out.println("Deleting at postion");
        key= sc.nextInt();
        l1.deleteLocation(key);
        l1.printList();
        System.out.println();
        System.out.println("Element to search ");
        key= sc.nextInt();
        if (l1.isSearch(key)) {
            System.out.println(key+" found ");
        }
        else
            System.out.println(key +"not found");
        l1.printList();
        l1.printList();
        System.out.println("Sorted list ");
        l1.sortList();
        l1.printList();
        l1.reverseList();
        l1.printList();
        System.out.println("the size of the linked lis is "+listSize());
    }
    public static void reverseList() {
        if(head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public static void addNode(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            tail.next=newNode;
            tail=newNode;
        }
    }
    public static void printList()
    {
        Node newNode=head;
        if (head == null)
        {
            System.out.println("List is empty \n");
            return;
        }
//        First.Node newNode=head;
        System.out.println("\nlinked-List");
        while (newNode!=null)
        {
            System.out.print(newNode.data+" -> ");
            newNode=newNode.next;
        }
        System.out.println();
    }
    public static void deleteNode(int key)
    {
        // Store head node
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null)
            return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }
    public static void deleteLocation(int loc)
    {
        if (head == null) {
            System.out.println("List is empty \n");
            return;
        }
        Node temp = head;
        int position=loc;
        // If head needs to be removed
        if (position == 0) {
            head = temp.next; // Change head
            return;
        }
        // Find previous node of the node to be deleted
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;

        // If position is more than number of nodes
        if (temp == null || temp.next == null)
            return;

        // First.Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node nex = temp.next.next;
        temp.next = nex; // Unlink the deleted node from list
    }
    public  static boolean isSearch(int key)
    {
        if(head==null)
            return false;
        Node temp=head;
        while (temp!=null)
        {
            if(temp.data==key)
            {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public static void sortList()
    {
        Node temp=head,index=null;
        int t;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        else
        {
            while (temp!=null)
            {
                index=temp.next;
                while (index!=null)
                {
                    if (temp.data > index.data)
                    {
                        t=temp.data;
                        temp.data= index.data;
                        index.data=t;
                    }
                    index=index.next;
                }
                temp=temp.next;
            }
        }
    }
    public static void addAtPos(Node pos,int key)
    {

        if (pos == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node newNode=new Node(key);
        newNode.next=pos.next;
        pos.next=newNode;
    }
    /* Appends a new node at the end.  This method is
       defined inside LinkedList class shown above */
    public void append(int new_data)
    {
        /* 1. Allocate the First.Node &
           2. Put in the data
           3. Set next as null */
        Node new_node = new Node(new_data);

        /* 4. If the Linked List is empty, then make the
              new node as head */
        if (head == null)
        {
            head = new Node(new_data);
            return;
        }

        /* 4. This new node is going to be the last node, so
              make next of it as null */
        new_node.next = null;

        /* 5. Else traverse till the last node */
        Node last = head;
        while (last.next != null)
            last = last.next;

        /* 6. Change the next of last node */
        last.next = new_node;
        return;
    }
    public static int listSize()
    {
        int ct=0;
        Node temp=head;
        if (head == null) {
            return ct;
        }
        while (temp!=null)
        {
            ct++;
            temp=temp.next;
        }
        return ct;
    }
    public static void addAtBeg(int ele)
    {
        Node temp=new Node(ele);
        temp.next=head;
        head=temp;
    }
}

package OOPs;

import java.util.*;

public class Solution1 {

    public static void main(String[] args)
    {
        System.out.println("Question 1:-");
        addColors();
        System.out.println("Question 2:- ");
        aappendHashSet();
        System.out.println("Question 3:-");
        iterateHashList();
        System.out.println("Question 4:-");
        noOfEleHash();
    }
    public static void addColors()
    {
        System.out.println("Write  a Java program to create a new array list, add some colors (string) and print out the collection.");
        ArrayList<String> color=new ArrayList<>();
        color.add("Blue");
        color.add("Purple");
        color.add("Yellow");
        color.add("Red");
        color.add("Green");
        System.out.println(color+"\n");
    }
    public static void aappendHashSet()
    {
        System.out.println("Write a Java program to append the specified element to the end of a hash set");
        Set<Integer> set=new HashSet<>();
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(400);
        List<Integer> l1=new ArrayList<>();
        l1.add(500);
        set.addAll(l1);
        System.out.println(set+"\n");
    }
    public static void iterateHashList()
    {
        System.out.println(" Write a Java program to iterate through all elements in a hash list.");
        HashSet<Integer> hl=new HashSet<>();
        hl.add(100);
        hl.add(200);
        hl.add(300);
        hl.add(400);
        hl.add(500);
        Iterator value=hl.iterator();

        System.out.println("Elements:- \n");
        while (value.hasNext())
        {
            System.out.println(value.next());
        }
        System.out.println();
    }
    public static void noOfEleHash()
    {
        System.out.println("Write a Java program to get the number of elements in a hash set");
        HashSet<Integer> hl=new HashSet<>();
        hl.add(100);
        hl.add(200);
        hl.add(300);
        hl.add(400);
        hl.add(500);
        System.out.println(hl);
        System.out.println("No of elements in hash-set");
        System.out.println(hl.size());
    }
}






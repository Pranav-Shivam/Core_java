package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1'st string");
        String a=sc.next();
        System.out.println("Enter 2'nd string");
        String b=sc.next();
        if (isAnagram(a,b))
        {
            System.out.println("Anagram");
        }
        else {
            System.out.println("Nott anagram");
        }
        System.out.println("Enter a String & to check weather its palindrome or not");
        sc.nextLine();
        String s= sc.nextLine();
        StringBuffer r=new StringBuffer(s);
        r=r.reverse();
        if (r == null) {
            System.out.println("Its palindrome");
        }
        else if (r.toString().equals(s)) {
            System.out.println("Its palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
    public static boolean isAnagram(String s, String t) {
        char st[]=s.toCharArray();
        char tt[]=t.toCharArray();
        Arrays.sort(st);
        Arrays.sort(tt);
        if(Arrays.equals(st,tt))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

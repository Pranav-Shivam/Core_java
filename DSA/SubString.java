package DSA;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String s="abcde";
        int count=(int)countSubstring(s);
        System.out.println(count);
        checker();
    }
    public static double countSubstring(String s)
    {
        Set<Character> set=new HashSet<>();
        char arr[]=s.toCharArray();
        for (char ch:arr) {
            set.add(ch);
        }
        int l=set.size();
        return (l*(l+1)*0.5);
    }
    public static void checker()
    {
        int arr[]={1,2,3,4,5,6,7,8,9};
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            String s=Integer.toString(arr[i]);
            if(s.equals("05"))
            {
                flag=false;
            }
            else
            {
                flag=true;
            }
        }
        System.out.println(flag);
    }
}

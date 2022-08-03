package OOPs;

import java.util.Scanner;

public class Recursion1 {
    public static void printNum(int n) {
        if(n>5)
            return;
        System.out.println(n);
        printNum(n+1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        printNum(num);
    }
}

package OOPs;

import java.util.Scanner;

public class Fibbo_Recursion {
    public static void fibbo(int a,int b,int n) {

        if(n==0) {                          //if(n==0)
            return;
        }
        int c=a+b;
        System.out.println(c);
        fibbo(b,c,n-1);                       //fibbo(a,b,n-1)
    }

    public static void main(String[] args) {
        int a=0,b=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n ");
        int n= sc.nextInt();
        System.out.println(a);
        System.out.println(b);

        fibbo(0,1,n-2);
    }
}

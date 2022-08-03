package OOPs;

import java.util.Scanner;

public class Recursion_power {
    public static int pow(int a,int n) {
        if(n==0)
            return 1;
        return (a*pow(a,n-1));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no ");
        int a=sc.nextInt();
        System.out.println("Enter the power ");
        int n=sc.nextInt();
        System.out.println(pow(a,n));
    }
}

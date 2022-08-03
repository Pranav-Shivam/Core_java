package com.company;

import java.util.Scanner;

public class SeriesAndPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n for finding the sum of the series ");
        int n=sc.nextInt();
        series(n);
        System.out.println("\nThe Pattern is ");
        pattern();
    }
    public static long facti(int n)
    {
        if (n <= 1) {
            return 1;
        }
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void series(int n)
    {
        double sum=0.0;
        for (int i = 2; i <=n ; i++) {
            int x=2*i;
            sum=sum+((double)i/(double)facti(x));
        }
        System.out.println("The sum of the series is "+sum);
    }
    public static void pattern()
    {
        for(int i=1;i<=3;i++)
        {
            for (int sp = 2; sp >= i; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        for(int i=2;i>=1;i--)
        {
            for (int sp = 2; sp >= i; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

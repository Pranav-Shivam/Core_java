package com.company;

import java.util.Scanner;

public class Logic_Gate_Checker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of logic gates input ");
        int n= sc.nextInt();
        int m=(int)Math.pow(2,n);
        int a[] = { 1, 0, 1, 0, 1 };
        int b[]= { 0, 1, 1, 0, 0};
        int l= a.length;
        for (int i = 0; i < l; i++) {
            int x=a[i]+b[i];
            int y=a[i]*b[i];
        }

    }
}

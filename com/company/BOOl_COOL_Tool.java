package com.company;

import java.util.Scanner;

public class BOOl_COOL_Tool {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0)
        {
            int x= sc.nextInt();
            System.out.println(RBF(x));
        }
    }
    public static boolean isPrime(int n)
    {
        int ct=0;
        for (int i = 1; i <=n; i++) {
            if (n%i == 0) {
                ct++;
            }
        }
        if (ct == 2) {
            return true;
        }
        else
            return false;
    }
    public static boolean RBF(int n)
    {
        int ct=0;
        for (int i = 1; i <=n; i++) {
            if (GCD(i,n)==1) {
                ct++;
            }
        }
        return isPrime(ct);
    }
    public static int GCD(int temp1,int temp2)
    {
        int temp=1;
            while (temp2!=0)
            {
                temp=temp2;
                temp2=temp1%temp2;
                temp1=temp;
            }
            return temp;
    }
}

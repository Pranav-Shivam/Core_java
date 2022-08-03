package com.company;

import java.util.Scanner;

public class AddSub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the choice for your operation : ");
        System.out.println("1 for Addition");
        System.out.println("2 for Subtraction");
        System.out.println("Else Exit");
        int choice=sc.nextInt();
        switch (choice)
        {
            case 1:
                int a=20;
                int b=10;
                int sum=a+b;
                System.out.println("The Addtion of "+ a +"and "+b+" is "+sum);
                break;
            case 2:
                int x=20;
                int y=10;
                int sub=x-y;
                System.out.println("The Subtraction of "+ x +" and "+y+" is "+sub);
                break;
            default:
                System.out.println("Your Against the choice ");
                System.exit(0);

        }
    }
}

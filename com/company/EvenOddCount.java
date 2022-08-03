package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the list");
        int n= sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>(n);
        System.out.println("Enter the array element in the list ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int countEven=0,countOdd=0;
        for (Integer a:list) {
            if (a%2==0) {
                countEven++;
            }
            else
            {
                countOdd++;
            }
        }
        System.out.println(list+" Contains even no are : " +countEven);
        System.out.println(list+" Contains odd no are : " +countOdd);
    }
}

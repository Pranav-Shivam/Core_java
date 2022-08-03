package com.company;

import java.util.Scanner;

public class ADC_Convertor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of circuit used in the ADC");
        int n=sc.nextInt();
        int diode=(int)Math.pow(2,n);
        printCircuitup2(diode,n);
    }
    public static void printCircuitup2(int di,int n)
    {

        for (int i = 0; i < di; i++) {
            int x=Integer.parseInt(Integer.toBinaryString(i));
            if (n == 2) {
                System.out.printf("%02d%n",x);
            } else if (n==3) {
                System.out.printf("%03d%n",x);
            } else if (n==4) {
                System.out.printf("%04d%n",x);
            } else if (n==5) {
                System.out.printf("%05d%n",x);
            }
            else {
                System.out.println("Please check the no of diode ");
            }
        }
    }
}

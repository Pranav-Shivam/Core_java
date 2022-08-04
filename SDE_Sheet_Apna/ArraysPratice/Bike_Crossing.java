package SDE_Sheet_Apna.ArraysPratice;

import java.util.Scanner;

public class Bike_Crossing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int ct=0,sum=0;
        for (int i = 0; i < n; i++) {
            int k=sc.nextInt();
            if(k==1)
            {
                sum=sum+ct;
            }
            else {
                ct++;
            }
        }
        System.out.println(sum);
    }
}

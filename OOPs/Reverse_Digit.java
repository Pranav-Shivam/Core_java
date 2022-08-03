package OOPs;

import java.util.Scanner;

public class Reverse_Digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no . ");
        int n= sc.nextInt();
        int m=n;
        sc.close();
        int rev=0;
        while(n>0)
        {
            int dig=n%10;
            rev=(rev*10)+dig;
            n=n/10;

        }
        System.out.println("Reverse is :-  "+rev);
    }
}

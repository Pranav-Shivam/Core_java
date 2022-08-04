package First;

import java.util.Scanner;

public class AternateIncrement {
    //Alternate increment 0021426374
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int n= sc.nextInt() ;
        System.out.println("The "+n+"th value of the series will be :- "+increSeries(n));
        System.out.println("The "+n+"th value of the series will be :- "+incre2(n));
        System.out.println("The "+n+"th value of the series will be :- "+incre3(n));
        System.out.println("The "+n+"th value of the series will be :- "+incre4(n));
        System.out.println(productOfDigit(4571));
        String s="stuvwxyz";
        System.out.println(cipher(s));
    }
    public static int increSeries(int n)
    {
        // 0 0 2 1 4 2 6 3 8 4 10 5 ....
        int e=0,o=0;
        if (n == 1) {
            return o;
        }
        if(n==2)
        {
            return e;
        }
        for (int i = 3; i <=n ; i++) {
            if (i%2 == 0) {
                e=e+1;

            }
            else
            {
                o=o+2;

            }
        }
        if (n%2 == 0) {
            return e;
        }
        else {
            return o;
        }
    }
    public static int incre2(int n) {
        // 0 0 7 6 14 18 21 24 ....
        if (n == 0 || n == 1) {
            return 0;
        }
        if (n % 2 != 0) {
            int x = n / 2;
            return x * 7;
        } else {
            int x = (n - 1) / 2;
            return x * 6;
        }
    }
    public static int incre3(int n)
    {
        if(n%2==0)
        {
            return 8+3*((n-2)/2);
        }
        else {
            int t=(n+1)/2;
            return 3*t;
        }
    }
    public static int incre4(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        if(n%2==0)
        {
            int k=(n-1)/2;
            return (int)Math.pow(3,k);

        }
        else
        {
            int k=(n-1)/2;
            return (int)Math.pow(2,k);
        }
    }
    public static int productOfDigit(int n)
    {
        int p=1;
        while(n>0)
        {
            int d=n%10;
            p=p*d;
            n=n/10;
        }
        return p;
    }
    public static String cipher(String s)
    {
        String str="";
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            int x=(int)ch+5;
            if(x>122)
            {
                x=x-122+96;
                str=str+(char)(x);
            }
            else
            {
                str=str+(char)x;
            }
        }
        return str;
    }

}


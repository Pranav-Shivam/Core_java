package DSA;
import java.util.*;
public class Armstrong_No {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a no");
//        int n=sc.nextInt();
//        System.out.println("No. is pali or not "+isPali(n));
//        System.out.println("No. is armstrong or not "+isArmstrong(n));
        System.out.println("Enter the range for fibonacci series");
        System.out.println("Enter staring range");
        long a=sc.nextLong();
        System.out.println("Enter the end range");
        long b= sc.nextLong();
        fibbonacciInRange(a,b);
//        HighestNo3(11,9,22);
        //isAutomorphic(27);
    }
    public static void fibbonacciInRange(long n1,long n)
    {
        long a=0;
        long b=1;
        if (a>=n1 &&a <= n) {
            System.out.print(a+" ");
        }
        if (b>=n1 &&b<= n) {
            System.out.print(b+" ");
        }
        for (long i = 1; i <=n; i++) {
            long c=a+b;
            if (c>=n1 &&c <= n) {
                System.out.print(c+" ");
            }
            if (c >= n) {
                break;
            }
            a=b;
            b=c;
        }
    }
    public static boolean isPali(int n)
    {
        int m=n;
        int rev=0;
        while (m>0)
        {
            int d=m%10;
            rev=(rev*10)+d;
            m=m/10;
        }
        if (rev == n) {
            return true;
        }
        return false;
    }
    public static boolean isArmstrong(int n)
    {
        int m=n;
        int cDig=countDigit(n);
        int result=0;
        while (n>0)
        {
            int dig=n%10;
            result=result+(int)Math.pow(dig,cDig);
            n=n/10;
        }
        if (result == m) {
            return true;
        }
        return false;
    }
    public static int countDigit(int n)
    {
        int ct=0;
        while (n>0)
        {
            int dig=n%10;
            ct++;
            n=n/10;
        }
        return ct;
    }
    public static void HighestNo3(int a,int b,int c)
    {
        System.out.println((a>b&&a>c)?a:(b>a&&b>c)?b:c);
    }
    public static void isAutomorphic(int n)
    {
        int m=n;
        int x=(int)Math.pow(n,2);
        if((x-m)%10==0)
        {
            System.out.println("Automorphic no");
        }
        else
        {
            System.out.println("Not Auti");

        }
    }
}

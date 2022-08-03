package OOPs;

public class fibonacciByRecursion {
    public static void main(String[] args) {
        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        printFibbo(a,b,8 );
    }

    public static void printFibbo(int a,int b,int n) {
        if(n<=10 && n>=1)
        {
            int c=a+b;
            if (c >= 10) {
                return;
            }
            System.out.print(c+" ");
            n=n-1;
            printFibbo(b,c,n);
        }
    }
}

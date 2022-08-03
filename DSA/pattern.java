package DSA;

public class pattern {
    public static void main(String[] args) {
        System.out.println("Pattern 1");
        pattern1(5);
        System.out.println("Pattern 2");
        pattern2(5);
        System.out.println("Pattern 3");
        pattern3(5);
        System.out.println("Pattern 4");
        pattern4(5);
        System.out.println("Pattern 5");
        pattern5(5);
        System.out.println("Pattern 6");
        pattern6(5);
    }
    public static void pattern1(int n)
    {
        for (int i = n; i>=1 ; i--) {
            for (int sp = i-1; sp >=1 ; sp--) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
    public static void pattern2(int n)
    {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
    public static void pattern3(int n)
    {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print((char)(i+64));
            }
            System.out.println();
        }
    }
    public static void pattern4(int n)
    {
        for (int i = 1; i <=n ; i++) {
            for (int j = n; j >=i ; j--) {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
    public static void pattern5(int n)
    {
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <=n-1 ; i++) {
            for (int j = n-1; j >=i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n)
    {
        int x,t=1;
        for (int i = n*2; i >=1 ; i--) {
            if(i==n)
            {
                continue;
            }
            if (i%n==0)
            {
                printS(n);
            }
            else
            {
                if(i<n)
                {
                    printS(++t);
                }
                else
                {
                    x=i%n;
                    printS(x);
                }
            }
            System.out.println();
        }
    }
    public static void printS(int n)
    {
        for (int i = n; i >= 1; i--) {
            System.out.print(i+" ");
        }
    }
}

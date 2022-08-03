package OOPs;

public class Pattern3 {
    public static void main(String[] args) {
        pat1();
        pat2();
        pat3();
        pat4();
        pat5();
    }

    public static void pat1()
    {
        System.out.println("------------**********************----------------");
        /*  *      *
            **    **
            ***  ***
            ********
            ********
            ***  ***
            **    **
            *      *         */
        int n = 4;
       for(int i=1;i<=n;i++)
       {
           for (int j = 1; j <=i ; j++) {
               System.out.print("*");

           }
           for (int st = n-1; st >=i; st--)
           {
               System.out.print(" ");
           }
           for (int st = n-1; st >=i; st--)
           {
               System.out.print(" ");
           }
           for (int k = 1; k <=i ; k++) {
               System.out.print("*");

           }
           System.out.println();
       }
       for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            for (int st = 1; st <=n-i ; st++) {
                System.out.print(" ");
            }
            for (int st = 1; st <=n-i ; st++) {
                System.out.print(" ");
            }
           for (int j = 1; j <=i ; j++) {
               System.out.print("*");
           }
           System.out.println();
        }
        System.out.println("------------**********************----------------");
    }
    public static void pat2()
    {
        System.out.println("------------**********************----------------");
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int sp = n-1; sp >=i ; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n ; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("------------**********************----------------");
    }
    public static void pat3()
    {
        System.out.println("------------**********************----------------");
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for (int j = n-1; j >=i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("------------**********************----------------");
    }
    public static void pat4() {
        System.out.println("------------**********************----------------");
        int n = 5;
        int m=1;
        int o=2;
        for (int i = n; i >=1 ; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print(" ");
            }
            for (int k = m; k >=1 ; k--) {
                System.out.print(k);
            }
            m++;
            for (int l = 2; l <o; l++) {
                if(i!=5)
                    System.out.print(l);
            }
            o++;
            System.out.println();
        }
        System.out.println();
        System.out.println("------------**********************----------------");
    }
    public static void pat5() {
        System.out.println("------------**********************----------------");
        int n = 5;
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                if (j==i||j==1)
                    System.out.print("@");
                else
                    System.out.print(" ");
            }
            for (int k = n; k >i ; k--) {
                System.out.print(" ");
            }
            for (int k = n; k >i ; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                if (j==i||j==1)
                    System.out.print("@");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = n; i >1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                if (j==i||j==1)
                    System.out.print("@");
                else
                    System.out.print(" ");
            }
            for (int k = n; k >i ; k--) {
                System.out.print(" ");
            }
            for (int k = n; k >i ; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                if (j==i||j==1)
                    System.out.print("@");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

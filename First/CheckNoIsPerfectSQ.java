package First;

import java.util.Map;
import java.util.Scanner;

public class CheckNoIsPerfectSQ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no ");
        int n=sc.nextInt();
        System.out.println(isPerfectSQ(n));
    }
    public static boolean isPerfectSQ(int n)
    {
        if(Math.sqrt(n)==Math.floor(Math.sqrt(n)))
        {
            return true;
        }
        return false;
    }
}

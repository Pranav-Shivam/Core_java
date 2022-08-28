package First;

import java.util.*;

public class PowerOfAToB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=2;//sc.nextDouble();
        int b=-1; //sc.nextInt();
        double pow=1.0;
        for (int i = 1; i <= b; i++) {
            pow=pow*a;
        }
        System.out.println(pow);
        if(b<0)
        {
            System.out.println(1.0/pow(a,b));
        }
        System.out.println(Math.pow(a,b));
    }
    public static double pow(double a,int b)
    {
        double power=1.0;
        for (int i = 1; i <=b; i++) {
            power=power*a;
        }
        return power;
    }
}

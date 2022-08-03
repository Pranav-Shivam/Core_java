package OOPs;

import java.util.Scanner;

public class Lcm_Hcf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1= sc.nextInt();
        int n2=sc.nextInt();
        sc.close();
        int lcm,hcf,temp1,temp2,temp = 1;
        temp1=n1;
        temp2=n2;
        int pro=n1*n2;
        while (temp2!=0)
        {
            temp=temp2;
            temp2=temp1%temp2;
            temp1=temp;
        }
        hcf=temp;
        lcm=pro/hcf;
        System.out.println(lcm +"\t"+hcf);
    }
}

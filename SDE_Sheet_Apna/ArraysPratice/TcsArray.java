package SDE_Sheet_Apna.ArraysPratice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class TcsArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
//        int arr[]={-153,-689};
//        int n= arr.length;
        int m=arr[0];
        int ct=0;
        for(int x:arr)
        {
            if(x<0)
            {
                m=Integer.max(m,x);
                ct++;
            }
        }
        if(ct==n)
        {
            System.out.println(m);
            return;
        }
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        for (int x:arr) {
            if (x >0) {
                pos.add(x);

            }
            else if(x<0)
            {
                neg.add(x);
            }
        }
        int maxP=Collections.max(pos);
        int maxN=Collections.max(neg);
        int ret=maxP+maxN;
        System.out.println(ret);
    }
}

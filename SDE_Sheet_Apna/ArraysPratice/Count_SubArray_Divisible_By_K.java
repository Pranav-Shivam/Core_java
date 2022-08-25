package SDE_Sheet_Apna.ArraysPratice;

import java.util.*;
public class Count_SubArray_Divisible_By_K {
    public static void main(String[] args) {
        int arr[]={4,5,0,-2,-3,1};
        System.out.println(new Count_SubArray_Divisible_By_K().subArrayDivByK(arr,5));
    }
    int subArrayDivByK(int arr[],int k)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int ct=0;
        map.put(0,1);
        for (int i = 0; i <arr.length ; i++) {
            sum=sum+arr[i];
            int rem=sum%k;
            if(rem<0)
            {
                rem=rem+k;
            }
            if (map.containsKey(rem) ) {
                ct=ct+map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return ct;
    }
}

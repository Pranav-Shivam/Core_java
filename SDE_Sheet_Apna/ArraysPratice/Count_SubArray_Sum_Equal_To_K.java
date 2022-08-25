package SDE_Sheet_Apna.ArraysPratice;

import java.util.*;
public class Count_SubArray_Sum_Equal_To_K {
    public static void main(String[] args) {
        int arr[]={10,5,7,1,2,5,3};
        System.out.println(new Count_SubArray_Sum_Equal_To_K().subArrSumEqualK(arr,15));
    }
    public int subArrSumEqualK(int arr[],int k)
    {
        int sum=0;
        int ct=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
            int temp=sum-k;
            if(map.containsKey(temp))
            {
                ct=ct+map.get(temp);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ct;
    }
}

package SDE_Sheet_Apna.ArraysPratice;

import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int arr[]={1,7,2,8,4,6,5,3,9,0};
        System.out.println(twoSum(arr,9));
    }
    public static int[] twoSum(int[] arr, int target)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],i);
        }
        for(int i=0;i<arr.length;i++)
        {
            int x=arr[i];
            int dif=target-x;
            if(map.containsKey(dif))
            {
                int ind=map.get(dif);
                if(ind!=i)
                {
                    return new int[]{i,ind};
                }
            }
        }

        return new int[]{0,0};
    }
}

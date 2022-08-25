package SDE_Sheet_Apna.ArraysPratice;

import java.util.*;
public class Longest_Subarray_With_Sum_Divisible_By_K {
    int longSubarrWthSumDivByK(int arr[], int n, int k)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum = 0;
        int ans = 0;
        hm.put(0,-1);

        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            int r = sum%k;
            if(r<0)
            {
                r = r+k;
            }
            if(hm.containsKey(r))
            {
                ans = Math.max(ans,i-hm.get(r));
            }
            else
            {
                hm.put(r,i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[]={2, 7, 6, 1, 4, 5};
        int n= arr.length;
        int k=3;
        int ld=new Longest_Subarray_With_Sum_Divisible_By_K().longSubarrWthSumDivByK(arr,n,k);
        System.out.println(ld);
    }
}

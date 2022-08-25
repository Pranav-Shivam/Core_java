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
            System.out.println("Array of arr["+i+"]  "+arr[i]+"   Sum = "+sum +"   Rem = "+ r);
            if(r<0)
            {
                r = r+k;
            }
            if(hm.containsKey(r))
            {
                System.out.println(hm.get(r));
                ans = Math.max(ans,i-hm.get(r));
                System.out.println("Ans = "+ans);
            }
            else
            {
                hm.put(r,i);
            }
            System.out.println(hm);
            System.out.println();
            System.out.println("\n");
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[]={2, 7, 6, 1, 4, 5};
        int n= arr.length;
        int k=3;
        //int lds=new Longest_Subarray_With_Sum_Divisible_By_K().longSubarrWthSumDivByK(arr,n,k);
        int ld=new Longest_Subarray_With_Sum_Divisible_By_K().subarraysDivByK(arr,k);
        System.out.println(ld);
    }
    public int subarraysDivByK(int[] nums, int k) {
        int count=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap();
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            int temp=sum%k;
            System.out.println("Array of arr["+i+"]  "+nums[i]+"   Sum = "+sum +"   Rem = "+ temp);
            if(temp<0)
                temp+=k;
            if(map.containsKey(temp)) {
                System.out.println("Map.get(" + temp + ")  " + map.get(temp));
                count += map.get(temp);
                System.out.println("Sum = "+count);
            }

            map.put(temp,map.getOrDefault(temp,0)+1);
            System.out.println(map);
            System.out.println();
            System.out.println("\n");
        }
        return count;
    }
}

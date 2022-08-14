package SDE_Sheet_Apna.ArraysPratice;

import java.util.*;
public class MaxProOfSubset {
    public static void main(String[] args) {
        int arr[]={6,-3,-10,0,2};
        System.out.println(maxProduct(arr, arr.length));
        System.out.println(maxProduct(arr));
    }
    static long maxProduct(int[] arr, int n) {
        // code here
        long max=arr[0];
        long min=max;
        long result=max;
        long ans=max;
        for(int i=1;i<n;i++)
        {
            if(arr[i]<0)
            {
                long temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(arr[i],max*arr[i]);
            min=Math.min(arr[i],min*arr[i]);
            result=Math.max(max,min);
            if(ans<result)
                ans=result;
        }
        return ans;
    }
    static long maxProduct(int[] arr)
    {
        int n= arr.length;
        List<List<Integer>> ans=subset(arr,n);
        return pro(ans);
    }
    static List<List<Integer>> subset(int arr[],int n)
    {
        List<Integer> curr=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        findSubset(arr,0,curr,ans);
        return ans;
    }
    static void findSubset(int arr[],int i,List<Integer> curr,List<List<Integer>> ans)
    {
        if(i==arr.length)
        {
            ans.add(new ArrayList<Integer>(curr));
            return;
        }
        curr.add(arr[i]);
        findSubset(arr,i+1,curr,ans);
        curr.remove(curr.size()-1);
        findSubset(arr,i+1,curr,ans);
    }
    static long pro(List<List<Integer> > ans)
    {
        long max=Integer.MIN_VALUE;
        for (int i = 0; i < ans.size(); i++)
        {
            long pro=1;
            for (int j = 0; j < ans.get(i).size(); j++)
            {
                pro=pro*(long)ans.get(i).get(j);
            }
            max=Long.max(max,pro);
        }
        return max;

    }
}

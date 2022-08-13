package SDE_Sheet_Apna.ArraysPratice;

import java.util.*;
public class SubsetofArray {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(subsets(arr));
    }
    public static List<List<Integer>> subsets(int arr[])
    {
        List<Integer> curr=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        findSubset(arr,0,curr,ans);
        return ans;
    }
    public static void findSubset(int arr[],int i,List<Integer> curr,List<List<Integer>> ans)
    {
        if(arr.length==i)
        {
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(arr[i]);
        findSubset(arr,i+1,curr,ans);
        curr.remove(curr.size()-1);
        findSubset(arr, i+1, curr, ans);
    }
}

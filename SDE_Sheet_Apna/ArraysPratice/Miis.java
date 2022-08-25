package SDE_Sheet_Apna.ArraysPratice;

import java.util.*;


public class Miis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        //Array ko input lelo
        List<List<Integer>> adj=subsets(arr);
        int x=sum(adj);
        System.out.println(x);
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
    public  static int sum(List<List<Integer>> adj)
    {
        int sum=0;
        for (int i = 0; i < adj.size(); i++) {
            for (Integer x:
                 adj.get(i)) {
                int max= Collections.max(adj.get(i));
                int min=Collections.min(adj.get(i));
                int t=min-1;
                if(t>0)
                {
                    sum=sum+t;
                }
                else {
                    sum=sum+max+1;
                }
                
            }
            
        }
        return sum;
    }
}

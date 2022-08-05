package SDE_Sheet_Apna.ArraysPratice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class ReplaceEleByRank {
    public static void main(String[] args) {
        int arr[]={1,7,2,9,3,5,4,8,6};
        int ari[]={1,7,2,9,3,5,4,8,6};
        HashMap<Integer,Integer> map=new HashMap<>();
        Arrays.sort(ari);
        for (int i = 0; i < arr.length; i++) {
            int index=Arrays.binarySearch(ari,arr[i]);
            map.put(arr[i],index+1 );
        }
        for (int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                int x=(int)map.get(arr[i]);
                System.out.println(arr[i]+" >>>>>  "+x);
            }
        }
        check(arr);
    }
    public static void check(int arr[])
    {
        Queue<Integer> pq=new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.offer(arr[i]);
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i< arr.length;i++)
        {
            int x=pq.poll();
            map.put(x,i+1);
        }
        for (int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                int x=map.get(arr[i]);
                System.out.println(arr[i]+" >>>>>  "+x);
            }
        }
    }

}

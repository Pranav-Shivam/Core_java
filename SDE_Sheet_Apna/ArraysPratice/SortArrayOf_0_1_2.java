package SDE_Sheet_Apna.ArraysPratice;

import java.util.*;

public class SortArrayOf_0_1_2 {
    public static void main(String[] args) {
        int arr[] = {2, 0, 2, 0};
        int l = args.length;
        //new SortArrayOf_0_1_2().sort(arr, l);
        System.out.println("\n");
        new SortArrayOf_0_1_2().sortColors(arr);
    }

    public int[] sort(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        ArrayList<Integer> temp=new ArrayList<>();
         for (Map.Entry e:map.entrySet()) {
             int k=(int)e.getKey();
             int v=(int)e.getValue();
             int j=0;
             for(int i=0;i<v;i++)
             {
                 //System.out.print(k+ " ");
                 temp.add(k);
             }
         }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp.get(i);
            System.out.print(arr[i]+" ");
        }
        return arr;
    }



    //Not used in all case if(any of the value is not present
    public void sortColors(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        ArrayList<Integer> temp = new ArrayList<>();
        int s0=0;
        int s1=0;
        int s2=0;
        if(map.get(0)!=null)
        {
            s0=map.get(0);
        }
        if(map.get(1)!=null)
        {
            s1=map.get(1);
        }
        if(map.get(2)!=null)
        {
            s2=map.get(2);
        }
        for (int i = 0; i < s0; i++) {
            temp.add(0);
        }
        for (int i = 0; i < s1; i++) {
            temp.add(1);
        }
        for (int i = 0; i <s2; i++) {
            temp.add(2);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp.get(i);
            System.out.print(arr[i]+" ");
        }
    }
}

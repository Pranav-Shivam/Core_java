package SDE_Sheet_Apna.ArraysPratice;

import java.util.*;
public class MaximumFrequency {
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        System.out.println(new MaximumFrequency().majorityElement(arr));
    }
    public int majorityElement(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int max=0;
        max=Collections.max(map.values());
        for (Map.Entry m:map.entrySet()
             ) {
            int k=(int)m.getKey();
            int v=(int)m.getValue();
            if(v==max)
            {
                return k;
            }
        }
        return 0;
    }
}


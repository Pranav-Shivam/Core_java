package SDE_Sheet_Apna.ArraysPratice;

import java.util.*;
public class Majority_Element_With_n_By_3_Freq {
    public static void main(String[] args) {
        
    }
    public List<Integer> majorityElement(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1 );
        }
        for (int x: map.keySet()) {
            if (map.get(x)>arr.length/2)
            {
                list.add(x);
            }
        }
        return list;
    }
}

package SDE_Sheet_Apna.ArraysPratice;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class RemoveDuplicateEle {
    public static void main(String[] args) {
        int arr[] = { 0, 4, 3, 2, 7, 8, 2, 3, 1 ,4,0};
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for (Map.Entry m:map.entrySet()) {
            int k=(int)m.getKey();
            int v=(int)m.getValue();
            if(v>1)
            {
                list.add(k);
            }
        }
        System.out.println(list.toString());
    }
}

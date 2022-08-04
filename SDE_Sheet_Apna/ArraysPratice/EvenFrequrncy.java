package SDE_Sheet_Apna.ArraysPratice;

import java.util.HashMap;
import java.util.Map;

public class EvenFrequrncy {
    public static void main(String[] args) {
        int arr[]={1,2,2,2,3,4,4};
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i],1 );
            }
            else
            {
                map.put(arr[i], map.get(arr[i])+1);
            }
        }
        for(Map.Entry e:map.entrySet())
        {
            int k= (int)e.getKey();
            int v=(int) e.getValue();
            if(v%2==0)
            {
                System.out.println(k);
                break;
            }
        }
    }
}

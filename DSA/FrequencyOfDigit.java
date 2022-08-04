package DSA;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfDigit {
    public static void main(String[] args) {
        long x=1425745312;
        HashMap<Long,Integer> map=new HashMap<>();
        while(x>0)
        {
            long d=x%10;
            if(!map.containsKey(d))
            {
                map.put(d,1);
            }
            else {
                map.put(d,map.get(d)+1);
            }
            x=x/10;
        }
        for (Map.Entry set:map.entrySet()) {
            long key=(long)set.getKey();
            int value=(int)set.getValue();
            System.out.println(key+" ==>> "+value);
        }
    }
}

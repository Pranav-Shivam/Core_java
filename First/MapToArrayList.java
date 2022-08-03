package First;

import java.util.*;

public class MapToArrayList {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Pranav",1000);
        map.put("Toamr",5000);
        map.put("Shivam",6000);
        Iterator it=map.entrySet().iterator();
        while (it.hasNext())
        {
            Map.Entry pair=(Map.Entry)it.next();
            //System.out.println(pair.getKey()+" "+pair.getValue());
        }
        for (Map.Entry e:map.entrySet()) {
            String n=(String) e.getKey();
            int v=(int) e.getValue();
            System.out.println(++v);
        }
        List<String> name=new ArrayList<>(map.keySet());
        ArrayList<Integer> val=new ArrayList<>(map.values());
        System.out.println(name);
        System.out.println(val);
    }
}

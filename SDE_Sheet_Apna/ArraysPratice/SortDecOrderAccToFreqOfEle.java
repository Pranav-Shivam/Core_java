package SDE_Sheet_Apna.ArraysPratice;

import java.util.*;
public class SortDecOrderAccToFreqOfEle {
    public static void main (String[] args) {
        //code
        Scanner sc=new Scanner(System.in);

            int n=sc.nextInt();//length of the array
            ArrayList<Integer> list=new ArrayList<>();
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++)
            {
                int e=sc.nextInt();
                list.add(i,e);
//                if(!map.containsKey(e))
//                {
//                    map.put(e,1);
//                }
//                else
//                {
//                    map.put(e,map.get(e)+1);
//                }
                map.put(e,map.getOrDefault(e,0)+1);
            }
            HashMap<Integer,Integer> h=sortAccFre(map);
            for (Map.Entry<Integer, Integer> en :
                    h.entrySet()) {
                System.out.println("Key = " + en.getKey()
                        + ", Value = "
                        + en.getValue());
            }


    }
    public static HashMap<Integer,Integer> sortAccFre(HashMap<Integer,Integer> map)
    {
        List<Map.Entry<Integer,Integer>> list=new LinkedList<>(map.entrySet());
        Collections.sort(list,(i1,i2)->i1.getValue().compareTo(i2.getValue()));
        HashMap<Integer,Integer> temp=new HashMap<>();
        for(Map.Entry<Integer,Integer> l:list)
        {
            temp.put(l.getKey(),l.getValue());
        }
        return temp;
    }
}

package First;

import java.util.*;

public class CountCharOccurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String s=sc.nextLine().toLowerCase();
        HashMap<Character,Integer> count=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            if(!count.containsKey(ch))
            {
                count.put(ch,1);
            }
            else
            {
                count.put(ch,count.get(ch)+1);
            }
        }
        for (Map.Entry map:count.entrySet()) {
            char key=(char)map.getKey();
            int value=(int)map.getValue();
            if (value >= 1) {
                System.out.println(key+" -> "+value);
            }

        }
    }
}

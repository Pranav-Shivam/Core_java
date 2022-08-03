package DSA;

import java.util.HashMap;
import java.util.Map;

public class PrintAllDuplicateChar {
    public static void main(String[] args) {
        String  str="pranav shivam";
        printDuplicate(str);
    }
    public static void printDuplicate(String s)
    {
        HashMap<Character,Integer> du=new HashMap<>();
        for (int i = 0; i < s.length(); i++)
        {
            char ch=s.charAt(i);
            if (!du.containsKey(ch)) {
                du.put(ch,1);
            }
            else {
                du.put(ch,du.get(ch)+1);
            }
        }
        for (Map.Entry count: du.entrySet()) {
            char ch=(char)count.getKey();
            int fre=(int)count.getValue();
            if (fre>1)
            {
                System.out.println(ch+" "+fre);
            }
        }
    }
}

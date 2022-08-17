package SDE_Sheet_Apna.StringPratice;

import java.util.*;
public class EncryptTheString {
    public static void main(String[] args) {
        String s="aabc";
        //System.out.println(encryptString(s));
        encryptString(s);
    }
    static void encryptString(String s)
    {
        // code here
        String t="";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        Set<String> set=new LinkedHashSet<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int x=(int)map.get(ch);
            String temp=x+"";
            StringBuffer st=new StringBuffer(temp);
            temp=st.reverse().toString()+ch;
            set.add(temp);
        }
        List<String> list=new ArrayList<>(set);
        Collections.reverse(list);
        for(String te:list)
        {
            t=t+te;
        }
        System.out.println(t);
    }
    static String encryptedString(String s)
    {
        // code here
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int j = i;
            int c = 0;
            while (j < s.length() && s.charAt(i) == s.charAt(j)) {
                c++;
                j++;
            }
            ans.append(s.charAt(i));
            i = j - 1;
            ans.append(Integer.toString(c));
        }
        return ans.reverse().toString();
    }
}

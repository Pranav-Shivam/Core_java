package SDE_Sheet_Apna.StringPratice;

public class Spliting_Each_Word {
    public static void main(String args[]){
        String s1="java string split method    by javatpoint ";
        String[] words=s1.split("\\s");//splits the string based on whitespace
        String s="";
//using java foreach loop to print elements of string array
        for(String w:words){
            if(w!="")
            {
                s=s+w+" ";
            }
        }
        System.out.println(s.trim());
        System.out.println(splitWord(s1));
    }
    public static String splitWord(String s)
    {
        s=s.trim(); //used to remove ends spaces
        String st[]=s.split(" ");
        String str="";
        for(int i=0;i< st.length;i++)
        {
            if(st[i]!="")
            {
                str=str+st[i]+" ";
            }
        }
        return str.trim();
    }
}

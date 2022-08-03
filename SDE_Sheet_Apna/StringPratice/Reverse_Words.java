package SDE_Sheet_Apna.StringPratice;
import java.util.*;
public class Reverse_Words {
    public static String reverseWords(String s) {


        var st=new Stack<String>();  // new way to declare just use var

        s=s.trim(); // removing whitespaces from end of string

        s+=" "; // adding one space at last for last word to get as substring easily

        boolean f=false; // used flag

        int n=s.length();

        if(n==1)
            return s;

        int ind=0;  // to store the first index of word

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(!f && ch!=' '){    // this is to check when we get new word
                f=true;
                ind=i;
                continue;
            }
            if(f && ch==' '){    // this is when we get space and store the word
                String sub=s.substring(ind,i);
                st.add(sub);
                f=false;

            }
        }
        StringBuilder res=new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop()+" ");    // adding all words in res
        }
        String fin=res.toString().trim();    // .trim() used to remove one extra space  added on while appending in res

        return fin;
    }
    public static String reverseWord(String s)
    {
        s=s.trim(); //used to remove ends spaces
        String st[]=s.split(" ");
        String str="";
        for(int i=st.length-1;i>0;i--)
        {
            if(st[i]!="")
            {
                str=str+st[i]+" ";
            }
        }
        str=str+st[0];
        return str;
    }

    public static void main(String[] args) {
        String s="a good   example";
        System.out.println(reverseWord(s));
    }
}

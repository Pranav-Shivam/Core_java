package OOPs;

import java.util.Scanner;

public class Reverse_String_Recur {
    static int first=-1;
    static int last=-1;
    public static void ourrcence_F_L(String S,int index,char ele) {
        if(index==S.length()) {
            System.out.printf("\nfirst occurence of character '%c' is at :- %d \n", ele, first);
            System.out.printf("\nlast occurence of character '%c' is at :- %d \n", ele, last);
            return;
        }
        char ch=S.charAt(index);
        if (ch == ele) {
            if (first == -1) {
                first=index;
            }
            else
            {
                last=index;
            }
        }
        ourrcence_F_L(S,index+1,ele);
    }
    public static void rev(String S,int l) {
        if(l==0)
        {
            char ch=S.charAt(l);
            System.out.print(ch);
            return;
        }
        char ch=S.charAt(l);
        System.out.print(ch);
        rev(S,l-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :");
        String s=sc.nextLine();
        String S=s;
        int l=s.length();
        rev(s,l-1);
        ourrcence_F_L(S,0,'a');

    }

}

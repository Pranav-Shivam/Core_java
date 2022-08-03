package OOPs;

import java.util.Scanner;

public class Reverse_Word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s+" ";
        String S1=" ";
        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                S1=S1+ch;
            }
            else
            {
                int len=S1.length();
                String word=" ";
                for (int j = len-1; j >=0 ; j--) {
                    word=word+S1.charAt(j);
                }
                System.out.print(word);
                S1=" ";
            }
        }
    }
}

//first word change all vowel to @
//second word change all non vowel to %
//convert it into uppercase
package SDE_Sheet_Apna.StringPratice;

import java.util.Locale;

public class Change3Word {
    public static void main(String[] args) {
        String s="How are you";
        s=s.toLowerCase();
        String f="",m="",t="";
        String s1[]=s.split(" ");
        for (int i=0;i< s1.length;i++) {
            if (s1[i]!="") {
                if (i == 0) {
                    for (int j = 0; j < s1[i].length(); j++) {
                        char ch=s1[i].charAt(j);

                        if(ch=='a'||ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                            ch='@';
                        }
                        f=f+ch;
                    }
                }
                if (i == 1) {
                    for (int j = 0; j < s1[i].length(); j++) {
                        char ch=s1[i].charAt(j);

                        if(ch!='a'&&ch!='e' && ch!='i'&& ch!='o'&& ch!='u'){
                            ch='%';
                        }
                        m=m+ch;
                    }
                }
                if (i == 2) {
                    t=s1[i].toUpperCase();
                }
            }
        }
        System.out.println(f+m+t);
    }

}

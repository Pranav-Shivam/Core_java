package SDE_Sheet_Apna.StringPratice;

public class CaseConvetor {
    public static void main(String[] args) {
        String s="GeeksforGeeks A computer Science portal for Geeks";
        String t="";
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            int x=ch;
            if(x>=65 && x<=90)
            {
                t=t+Character.toLowerCase(ch);
            } else if (x>=97 && x<=122) {
                t=t+Character.toUpperCase(ch);
            }
            if(ch==' ')
            {
                t=t+' ';
            }
        }
        System.out.println(t.trim());
    }
}

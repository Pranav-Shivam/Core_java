package SDE_Sheet_Apna.StringPratice;

public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        String s="$Gee*k;s..fo, r'Ge^eks?";
        StringBuilder p=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if( (ch >='a' && ch<='z' ) || (ch>='A' && ch>='Z')) {
                p.append(ch);
            }
        }
        if (p == null || p.isEmpty() || p.length()==0) {

            System.out.println("-1");
        }
        System.out.println(p.toString());
    }
}

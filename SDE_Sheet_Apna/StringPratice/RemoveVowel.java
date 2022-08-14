package SDE_Sheet_Apna.StringPratice;

public class RemoveVowel {
    public static void main(String[] args) {
        String S="welcome to geeksforgeeks";
        String[] ls=new String[]{"a","e","i","o","u"};
        for(int i=0;i<ls.length;i++){
            S=S.replaceAll(ls[i],"");
        }
        System.out.println(S);
        String k= String.valueOf(S.charAt(2));
    }
}

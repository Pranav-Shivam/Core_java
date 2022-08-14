package SDE_Sheet_Apna.StringPratice;

public class RemoveChar {
    public static void main(String[] args) {
        String s="computer";
        System.out.println(s);
        String r="cat"; //removable characters
        for(int i=0;i<r.length();i++)
        {
            String k=String.valueOf(r.charAt(i));
            s=s.replaceAll(k,"");
        }
        System.out.println(s);
    }
}

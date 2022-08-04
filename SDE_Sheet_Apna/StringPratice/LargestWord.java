package SDE_Sheet_Apna.StringPratice;

public class LargestWord {
    public static void main(String[] args) {
        String s="My name is Pranav Shivam Tomar Knowledge is Greatest gift";
        String str[]=s.split("\\s");
        int max=Integer.MIN_VALUE;
        for (String a:str) {
            max=Math.max(a.length(),max);
        }
        System.out.println(max);
    }
}

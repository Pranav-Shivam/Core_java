package OOPs;

public class Non_repeating_Char_Recu {
    public static boolean map[]=new boolean[26];
    public static void nonRepeat(String s,int index, String str) {
        if(index==s.length())
        {
            System.out.println("Non Repeated string "+str);
            return;
        }
        char ch=s.charAt(index);
        if(map[ch-'a']==true){
            nonRepeat(s,index+1,str);
        }
        else {
            str+=ch;
            map[ch-'a']=true;
            nonRepeat(s,index+1,str);
        }
    }

    public static void main(String[] args) {
        String s="aabbctgjh";
        nonRepeat(s,0,"");
    }
}

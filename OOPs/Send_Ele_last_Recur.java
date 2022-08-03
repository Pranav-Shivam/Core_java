package OOPs;

public class Send_Ele_last_Recur {
    public static void last(String s,int index,int count,String newS) {
        if (index == s.length()) {
            for (int i = 0; i < count; i++) {
                newS+='x';
            }
            System.out.println(newS);
            System.out.println("no of x is "+count);
            return;
        }
        char ch=s.charAt(index);
        if (ch == 'x') {
            count++;
            last(s,index+1,count,newS);
        }
        else
        {
            newS+=ch;
            last(s,index+1,count,newS);
        }
    }

    public static void main(String[] args) {
        String s="axxbcdxxtmfg";
        last(s,0,0,"");
    }
}

package SDE_Sheet_Apna.StringPratice;

public class FirstAndLastLetterCapital {
    public static void main(String[] args) {
        String s="Geeks for geeks is best";
        String temp="";
        String st[]=s.split("[\\s]");
        for (int i = 0; i < st.length; i++) {
            if(st[i]!="")
            {
                int l= st[i].length();
                String t=st[i].substring(0,1).toUpperCase()+st[i].substring(1,l-1)+st[i].substring(l-1,l).toUpperCase();
                temp=temp+t+" ";
            }
        }
        System.out.println(temp.trim());
//        StringBuilder sb=new StringBuilder("");
//        sb.append('x');
//        System.out.println(sb);

        System.out.println(Count(s));
    }
    static int Count(String s)
    {
        int ct=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!Character.isDigit(ch) || ch!= '#' || ch!='!' || ch!='$' || ch!='&')
            {
                ct++;
            }
        }
        return ct;
    }
}

package SDE_Sheet_Apna.StringPratice;

public class Sum_Of_No_String {
    public static void main(String[] args) {
        String s="1abc23";
        String st[]=s.split("[\\D]");
//        for (int i = 0; i < st.length; i++) {
//            System.out.println(st[i]);
//        }
        long sum=0;

        for(int i=0;i<st.length;i++)
        {
            if(st[i]!="")
            {
                long x=Long.parseLong(st[i]);
                sum=sum+x;
            }
        }
        System.out.println(sum);
    }
}

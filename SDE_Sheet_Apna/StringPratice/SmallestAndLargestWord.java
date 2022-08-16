package SDE_Sheet_Apna.StringPratice;

public class SmallestAndLargestWord {
    public static void main(String[] args) {
        String s="GeeksforGeeks A computer Science portal for Geeks";

        String st[]=s.split("[\\s]");
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int minI=0;
        int maxI=-0;
        for(int i=0;i<st.length;i++)
        {
            if (st[i] != "" ){
                int l=st[i].length();
                if(max<l)
                {
                    max=l;
                    maxI=i;
                }
                if(min>l)
                {
                    min=l;
                    minI=i;
                }
            }
        }
        System.out.println("Largest word "+st[maxI]);
        System.out.println("Smallest word "+st[minI]);
    }
}

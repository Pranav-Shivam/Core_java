package SDE_Sheet_Apna.ArraysPratice;
import java.util.*;
public class ContainsDuplicates {
    public static void main(String[] args) {
        int arr[]={1,7,2,8,4,1,6,5,3,9,0};
        System.out.println(duplicate(arr));
    }
    public static boolean duplicate(int na[])
    {
        int n=na.length;
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            s.add(na[i]);
        }
        if(s.size()==n)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}

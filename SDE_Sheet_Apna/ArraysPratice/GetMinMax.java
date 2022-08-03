package SDE_Sheet_Apna.ArraysPratice;

import java.util.*;

public class GetMinMax {
    public static void main(String[] args) {
        int arr[]={1,7,2,8,4,11,6,5,3,9,0};
        int ar[]=getMinMax(arr);
        System.out.println(Arrays.toString(ar));
    }
    public static int[] getMinMax(int arr[])
    {
        Arrays.sort(arr);
        return new int[]{arr[0],arr[arr.length-1]};
    }
    public static int[] getMinMa(int arr[])
    {
        Arrays.sort(arr);
        List<Integer> list=new ArrayList<>();
        list.add(arr[0]);
        list.add(arr[arr.length-1]);
        int ar[]=list.stream().mapToInt(i -> i).toArray();
        return ar;
    }
}

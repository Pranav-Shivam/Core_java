package SDE_Sheet_Apna.ArraysPratice;

import java.util.*;
public class MeanMedian {
    public static void main(String[] args) {
        int arr[]={ 1, 3, 4, 2, 7, 5, 8,11, 6 };
        System.out.println(meanArr(arr));
        System.out.println(medianArr(arr));
    }
    public static double meanArr(int arr[])
    {
        double m=0.0;
        double s=0;
        for (int i=0;i<arr.length;i++)
        {
            s+=arr[i];
        }
        m=s/(double) arr.length;
        return m;
    }
    public static double medianArr(int arr[])
    {
        Arrays.sort(arr);
        if(arr.length%2!=0)
        {
            return (double) arr[arr.length/2];
        }
        return (double) ((arr[arr.length/2]+arr[(arr.length-1)/2])/2.0);
    }
}

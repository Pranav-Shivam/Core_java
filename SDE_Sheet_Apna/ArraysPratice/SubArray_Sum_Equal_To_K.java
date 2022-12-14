package SDE_Sheet_Apna.ArraysPratice;

import java.util.*;
public class SubArray_Sum_Equal_To_K {
    public static void main(String[] args) {
        int arr[]={10,15,-5,15,-10,5};
        new SubArray_Sum_Equal_To_K().subArraySum(arr,5);
    }
    void subArraySum(int arr[],int k)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int start=0;
        int end=-1;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
            int temp=sum-k;
            if(temp==0)
            {
                start=0;
                end=i;
                break;
            }
            if (map.containsKey(temp)) {
                start=map.get(temp)+1;
                end=i;
                break;
            }
            map.put(sum,i);
        }
        if (end == -1) {
            System.out.println("Not found");
        }
        else {
            System.out.println(start+"  ->  "+end);
        }
    }
}

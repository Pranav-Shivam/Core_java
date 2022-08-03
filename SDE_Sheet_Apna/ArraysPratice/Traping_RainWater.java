package SDE_Sheet_Apna.ArraysPratice;

import java.util.*;

public class Traping_RainWater {
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trapping(arr));
    }
    public static int secLar(int[] arr) {
        int k=2;
        Set<Integer> set=new HashSet<>();
        for (int a:arr) {
            set.add(a);
        }
        ArrayList<Integer> list=new ArrayList<>(set);
        //System.out.println(list);
        return list.get(list.size()-k);
    }
    public static int trap(int[] arr) {
        int sL=secLar(arr);
        //int sL=0;
        int sum=0;
        for (int i=0; i < arr.length; i++)
        {
            if (arr[i]<sL) {
                sum=sum+(sL-arr[i]);
            }
        }
        if (arr[0] == 0) {
            sum=sum-sL;
        }
        return sum;
    }
    public static int trapping(int height[])
    {
        int j= height.length-1;
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int leftMax =0;
        int rightMax =0;

        int result =0;

        for(int i=0;i<height.length;i++) {
            leftMax = Math.max(leftMax, height[i]);
            left[i] = leftMax;
            rightMax = Math.max(rightMax, height[j]);
            right[j] = rightMax;
            j--;
        }

        for(int i=0;i<height.length;i++) {
            result+= Math.min(left[i],right[i])-height[i];
        }

        return result;
    }

}

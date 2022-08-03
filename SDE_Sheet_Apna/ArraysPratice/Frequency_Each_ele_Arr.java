package SDE_Sheet_Apna.ArraysPratice;

import java.util.*;

public class Frequency_Each_ele_Arr {
    public static void printFreQuency(int arr[],int n)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i])+1 );
            }
            else
            {
                map.put(arr[i],1 );
            }
        }
        for (Map.Entry m: map.entrySet()) {
            int ele=(int)m.getKey();
            int fre=(int)m.getValue();
            System.out.println(ele+" "+fre);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array ");
        int l=sc.nextInt();
        int arr[]=new int[l];
        System.out.println("Enter the array elements ");
        for (int i = 0; i < l; i++) {
            arr[i]= sc.nextInt();
        }
        printFreQuency(arr,l);
    }
}

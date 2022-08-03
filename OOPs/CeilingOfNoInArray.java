package OOPs;

import java.util.*;
public class CeilingOfNoInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={8,4,6,7,2,1,9,12,14,17,5,21,25};
        Arrays.sort(arr);
        System.out.println("Enter the key u want to search ");
        int target=sc.nextInt();
        binarySearch(arr,target);
        int c=celing(arr,target);
        System.out.println("The celing of "+target+" is  "+ arr[c]);
        int f=floor(arr,target);
        System.out.println("The floor of "+target+" is  "+ arr[f]);
    }
    public static void binarySearch(int arr[],int key)
    {
        int start=0;
        int last= arr.length;
        int mid=(start+last)/2;
        boolean flag=false;
        while(start<=last)
        {
            mid=(start+last)/2;
            if(arr[mid]==key)
            {
                System.out.println("Element is found at "+(mid+1));
                flag=true;
                return;
            }
            else if(key>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                last=mid-1;
            }
        }
        if(!flag)
        {
            System.out.println("Sorry! Element not found");
        }
    }
    public static int celing(int arr[],int key)
    {
        int start=0;
        int last= arr.length;
        int mid=(start+last)/2;
        boolean flag=false;
        while(start<=last)
        {
            mid=(start+last)/2;
            if(arr[mid]==key)
            {
                System.out.println("Element is found at "+(mid+1));
                return mid;
            }
            else if(key>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                last=mid-1;
            }
        }
        return start;
    }
    public static int floor(int arr[],int key)
    {
        int start=0;
        int last= arr.length-1;
        int mid=(start+last)/2;
        boolean flag=false;
        while(start<=last)
        {
            mid=(start+last)/2;
            if(arr[mid]==key)
            {
                System.out.println("Element is found at "+(mid+1));
                return mid;
            }
            else if(key>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                last=mid-1;
            }
        }
        return last;

    }
}

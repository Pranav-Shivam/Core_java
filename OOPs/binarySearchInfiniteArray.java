package OOPs;

import java.util.Arrays;

public class binarySearchInfiniteArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,14,18,20,25};
        Arrays.sort(arr);
        int x=searchBinary(arr,8);
        System.out.println(" at index "+x);
        System.out.println(Arrays.toString(arr));
    }
    public static int searchBinary(int arr[],int key)
    {
        int start=0;
        int end=1;
        while(key>arr[end])
        {
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;
        }
        return binarySearch(arr,key,start,end);
    }
    public static int binarySearch(int arr[],int key,int start,int last)
    {

        while(start<=last)
        {
            int mid=start+(last-start)/2;
            if(arr[mid]==key)
            {
                System.out.print("Element is found at ");
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
        return -1;
    }
}

package OOPs;

import java.util.*;

public class FirstAndLastPosOfEleInArray {
    public static void main(String[] args) {
        int arr[]={8,9,6,7,6,4,9,8,7,7,5,8,7,1,3,4,7,9};
        Arrays.sort(arr);
        searchRange(arr,8);
        int f=preEnd(arr,8,true);
        int l=preEnd(arr,8,false);
        System.out.println(f+" "+l);
        System.out.println(Arrays.toString(arr));
    }
    public static void searchRange(int[] nums, int target) {
        System.out.println(Arrays.toString(new int[]{findFirstOccurrence(nums, target), findLastOccurrence(nums, target)}));
    }
    public static int findFirstOccurrence(int[] nums, int target) {
        // Left and right pointers
        int left = 0;
        int right = nums.length - 1;
        // Index of first occurrence
        int firstOccurrence = -1;
        // Loop until the two pointers meet
        while (left <= right) {
            // Middle index
            int middle = left + (right - left) / 2;
            // Check if we have found the value
            if (nums[middle] == target) {
                firstOccurrence = middle;
                right = middle - 1;
            }
            // If the target is less than the element
            // at the middle index
            else if (target < nums[middle]) {
                right = middle - 1;
            }
            // If the target is greater than the element
            // at the middle index
            else {
                left = middle + 1;
            }
        }
        return firstOccurrence;
    }

    public static int findLastOccurrence(int[] nums, int target) {
        // Left and right pointers
        int left = 0;
        int right = nums.length - 1;
        // Index of first occurrence
        int lastOccurrence = -1;
        // Loop until the two pointers meet
        while (left <= right) {
            // Middle index
            int middle = left + (right - left) / 2;
            // Check if we have found the value
            if (nums[middle] == target) {
                lastOccurrence = middle;
                left = middle + 1;
            }
            // If the target is less than the element
            // at the middle index
            else if (target < nums[middle]) {
                right = middle - 1;
            }
            // If the target is greater than the element
            // at the middle index
            else {
                left = middle + 1;
            }
        }
        return lastOccurrence;
    }
    public static int preEnd(int arr[],int key,boolean firstIndex)
    {
        int start=0;
        int end= arr.length-1;
        int ans=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(key<arr[mid])
            {
                end=mid-1;

            }
            else if(key>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                ans=mid;
                if(firstIndex)
                {
                    end=mid-1;

                }
                else {
                    start=mid+1;
                }
            }

        }
        return ans;
    }
}

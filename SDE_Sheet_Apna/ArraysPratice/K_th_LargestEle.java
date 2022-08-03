package SDE_Sheet_Apna.ArraysPratice;

import java.util.*;

public class K_th_LargestEle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array ");
        int l=sc.nextInt();
        int arr[]={3,2,1,5,6,4};
        //3 2 3 1 2 4 5 5 6
        l= arr.length;
//        System.out.println("Enter the array elements ");
//        for (int i = 0; i < l; i++) {
//            arr[i]= sc.nextInt();
//        }
        System.out.println(findKthLarges(arr,2));
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
        for(int i: nums){
            q.offer(i);

            if(q.size()>k){
                q.poll();
            }
        }

        return q.peek();
    }
    public static int findKthLarges(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}

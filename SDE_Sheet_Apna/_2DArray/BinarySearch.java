package SDE_Sheet_Apna._2DArray;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[][]={{1,3,5,7},
        {10,11,15,20},
        {23,30,34,60}};
        System.out.println(new BinarySearch().search(arr,16));
    }
    public boolean search(int arr[][],int target)
    {
        int index=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i][0]<=target)
            {
                index=Math.max(i,index);
            }
        }
        for (int x:arr[index]
             ) {
            if(x==target)
            {
                return true;
            }
        }
        return false;

    }
}

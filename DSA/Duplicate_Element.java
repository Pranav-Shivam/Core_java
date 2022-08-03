import java.util.*;
public class Duplicate_Element
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array ");
        int l=sc.nextInt();
        int arr[]=new int[l];
        System.out.println("Enter the array elemnt \n");
        for (int i = 0; i < l; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("\nArray elements ");
        for (int i = 0; i < l; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n The duplicate element are as follow");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[j]+"\t");
                }
            }
        }
        System.out.println("\n The duplicate element are as follow");
        sc.close();
    }
}

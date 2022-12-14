package DSA;
import java.util.*;
public class First_non_repeating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array ");
        int l=sc.nextInt();
        int arr[]=new int[l];
        System.out.println("Enter the array elemnt \n");
        for (int i = 0; i < l; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("\nArray elements \n");
        for (int i = 0; i < l; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        firstNonRepeatingElement(arr);
        sc.close();
    }
    static void firstNonRepeatingElement(int A[])
    {
        int n = A.length;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <= n; j++)
            {
                if (j == n)
                {
                    System.out.println("First non-repeating element is: "+A[i]);
                    return;
                }
                if (j != i && A[i] == A[j])
                {
                    break;
                }
            }
        }
        System.out.println("All the elements are repeating.");
    }
    public static int firstNonRepeat(int arr[])
    {
        int n= arr.length;
        int t=Integer.MIN_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i],1);

            }
            else
            {
                map.put(arr[i],map.get(arr[i])+1 );

            }
        }
        for(int i=0;i<arr[i];i++)
        {
            if(map.get(arr[i])==1)
            {
                t=arr[i];
                break;
            }
        }
        return t;
    }
}

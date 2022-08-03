package SDE_Sheet_Apna.ArraysPratice;
import java.util.*;
public class Repeat_and_Missing_Number_Array {
    public int [] repeatedNumber(final int[] a) {

        int n = a.length;

        long sumOfNum = (((long) n) * ((long) n + 1)) / 2;
        long sumOfSq = (((long) n) * ((long) n + 1) * ((long) 2*n + 1)) / 6;

        for (int i=0; i < n; i++) {
            sumOfNum -= (long) a[i];
        }

        for (int i=0; i < n; i++) {
            sumOfSq -= (long) a[i] * (long) a[i];
        }

        long sumNum = sumOfSq/sumOfNum;

        int missing = (int) (sumNum + sumOfNum)/2;
        int repeated = (int) (sumNum - missing);


        return new int[]{repeated,missing};

    }
    public static void repeatedNumbe(final int[] a) {

        int n = a.length;

        long sumOfNum = (((long) n) * ((long) n + 1)) / 2;
        long sumOfSq = (((long) n) * ((long) n + 1) * ((long) 2*n + 1)) / 6;

        for (int i=0; i < n; i++) {
            sumOfNum -= (long) a[i];
        }

        for (int i=0; i < n; i++) {
            sumOfSq -= (long) a[i] * (long) a[i];
        }

        long sumNum = sumOfSq/sumOfNum;

        int missing = (int) (sumNum + sumOfNum)/2;
        int repeated = (int) (sumNum - missing);


//        return new int[]{repeated,missing};
        System.out.println(repeated+" "+missing);

    }


    public static void main(String[] args) {
        int arr[]={3, 1, 2, 5 ,3};
        repeatedNumbe(arr);
    }
}

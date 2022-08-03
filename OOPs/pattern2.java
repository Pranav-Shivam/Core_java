package OOPs;
/*1
* 2 3
* 4 5 6
* 7 8 9 10
* 11 12 13 14 15 */
import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=1;
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i; j++) {
                int p=i+j;
                if(p%2==0)
                    System.out.print(1);
                else
                    System.out.print(0);

            }
            System.out.println();
        }
    }
}

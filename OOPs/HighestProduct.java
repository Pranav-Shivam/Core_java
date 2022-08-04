package OOPs;

public class HighestProduct {
    public static void main(String[] args) {
        int n=8;
        int pro=1;
        while(n%3!=0)
        {
            n=n-2;
            pro*=2;
        }

        System.out.println(pro*(int)Math.pow(3,n/3));
    }
}

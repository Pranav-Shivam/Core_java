package First;

public class SumOfPrimeNoInRange {
    public static void main(String[] args) {
        int n1=7;
        int n2=24;
        int sum=0;
        for(int i=n1+1;i<n2;i++)
        {
            if(isPrime(i))
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
    public static boolean isPrime(int n)
    {
        int ct=0;
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                ct++;
                if(ct>1)
                {
                    return false;
                }
            }
        }
        return true;
    }
}

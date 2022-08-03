package OOPs;

class Prime {
    static void checkPrime(int... num)
    {
        for(int n: num)
        {
            if (isPrime(n))
                System.out.println(num+" ");
        }
        System.out.println();
    }
    static boolean isPrime(int n)
    {
        int ct=0;
        for (int i = 1; i <= n; i++) {
            if (n%i == 0) {
                ct++;
            }
        }
        if (ct == 2) {
            return true;
        }
        else
            return false;
    }
}

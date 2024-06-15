public class SummationOfPrimes
{
    public static boolean checkPrime(long n)
    {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; (long) i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static long getSummationOfPrimes(long bound)
    {
        long num = 0;
        long sum = 0;
        while(num < bound)
        {
            if(checkPrime(num)) sum += num;
            num++;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        System.out.println(getSummationOfPrimes(2000000));
    }
}

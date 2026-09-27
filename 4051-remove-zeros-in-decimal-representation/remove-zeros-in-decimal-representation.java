class Solution 
{
    public long removeZeros(long n) 
    {
        long ans = 0;
        long place = 1;
        while (n > 0) 
        {
            long digit = n % 10;
            n /= 10;
            if (digit != 0) 
            {
                ans = digit * place + ans;
                place *= 10;
            }
        }

        return ans;
    }
}
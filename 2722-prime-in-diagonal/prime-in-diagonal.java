class Solution 
{
    public int diagonalPrime(int[][] nums) 
    {
        int max = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(isPrime(nums[i][i]) && nums[i][i] > max) 
            {
                max = nums[i][i];
            }
            int x = nums[i][nums.length - i - 1];
            if(isPrime(x) && x > max) 
            {
                max = x;
            }
        }
        return max;
    }
    public static boolean isPrime(int n) 
    {
        if(n < 2) 
            return false;
        if(n == 2) 
            return true;
        if(n % 2 == 0)
            return false;
        for(int i = 3; i * i <= n; i += 2) 
        {
            if(n % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
}
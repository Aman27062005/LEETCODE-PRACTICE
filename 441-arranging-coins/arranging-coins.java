class Solution 
{
    public int arrangeCoins(int n) 
    {
        int i=1;
        int s=0;
        while(n>=i)
        {
            n=n-i;
            i++;
            s++;
        }
        return s;
    }
}
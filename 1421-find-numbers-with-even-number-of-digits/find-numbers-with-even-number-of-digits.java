class Solution
{
    public int findNumbers(int[] nums) 
    {
        int co=0;
        for(int i=0;i<nums.length;i++)
        {
            if(cd(nums[i])%2==0)
            {
                co++;
            }
        }
        return co;
    }
    public static int cd(int n)
    {
        int c=0;
        while(n>0)
        {
            c++;
            n=n/10;
        }
        return c;
    } 
}
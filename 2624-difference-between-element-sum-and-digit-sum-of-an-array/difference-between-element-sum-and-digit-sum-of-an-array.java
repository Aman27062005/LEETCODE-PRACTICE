class Solution {
    public int differenceOfSum(int[] nums) 
    {
        int es=0;
        int ds=0;
        for(int i=0;i<nums.length;i++)
        {
            es+=nums[i];
            if(nums[i]<10)
            {
                ds+=nums[i];
            }
            else
            {
                ds+=diSum(nums[i]);
            }
        }
        return es-ds;
    }
    public static int diSum(int n)
    {
        int sum=0;
        while(n>0)
        {
            int r=n%10;
            sum+=r;
            n/=10;
        }
        return sum;
    }
}
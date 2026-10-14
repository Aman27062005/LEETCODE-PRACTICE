
class Solution 
{
    public int findPeakElement(int[] nums) 
    {
        int n = nums.length;

        if(n == 0)
        {
            return -1;
        }
        else if(n == 1)
        {
            return 0;
        }
        else if(n == 2)
        {
            if(nums[0] > nums[1])
            {
                return 0;
            }
            else
            {
                return 1;
            }
        }
        else
        {
            for(int i = 0; i < n; i++)
            {
                if(i == 0 && nums[i] > nums[i + 1])
                {
                    return 0;
                }
                else if(i == n - 1 && nums[i] > nums[i - 1])
                {
                    return n - 1;
                }
                else if(i > 0 && i < n - 1)
                {
                    if(nums[i] > nums[i + 1] && nums[i] > nums[i - 1])
                    {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}

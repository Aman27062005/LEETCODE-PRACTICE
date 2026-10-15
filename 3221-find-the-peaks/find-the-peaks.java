class Solution {
    public List<Integer> findPeaks(int[] nums) 
    {
        ArrayList<Integer> ll=new ArrayList<>();
        int n = nums.length;
        if(n == 0 || n==1 || n==2)
        {
            return ll;
        }
        else
        {
            for(int i = 1; i < n-1; i++)
            {
                    if(nums[i] > nums[i + 1] && nums[i] > nums[i - 1])
                    {
                        ll.add(i);
                    }
            }
        }
        return ll;
    }
}
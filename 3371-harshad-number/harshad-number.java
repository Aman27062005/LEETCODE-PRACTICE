class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) 
    {
        int r=0;
        int sum=0;
        int or=x;
        while(x>0)
        {
            r=x%10;
            sum+=r;
            x/=10;
        }
        if(or%sum==0)
        {
            return sum;
        }
        else
        {
            return -1;
        }
    }
}
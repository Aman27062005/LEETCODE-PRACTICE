class Solution {
    public int alternateDigitSum(int n) 
    {
        int x=reverse(n);
        int c=1;
        int r=0;
        int sum=0;
        while(x>0)
        {
            r=x%10;
            if(c%2!=0)
            {
                sum+=r;
            }
            else
            {
                sum+=(-1*r);
            }
            x=x/10;
            c++;
        }
        return sum;
    }
    public static int reverse(int n)
    {
        int r=0;
        int rev=0;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev;
    }
}
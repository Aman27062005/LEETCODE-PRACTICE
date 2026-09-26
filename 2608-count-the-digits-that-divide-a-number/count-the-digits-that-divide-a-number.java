class Solution {
    public int countDigits(int n) 
    {
        int c=0;
        int or=n;
        while(n>0)
        {
            int r=n%10;
            if(or%r==0)
            {
                c++;
            }
            n/=10;
        }
        return c;
    }
}
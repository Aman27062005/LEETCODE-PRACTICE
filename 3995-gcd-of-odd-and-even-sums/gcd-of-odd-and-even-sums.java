class Solution {
    public int gcdOfOddEvenSums(int n) 
    {
        int se=0,so=0;
        for(int i=1;i<=2*n;i=i+2)
        {
            so+=i;
            se+=(i+1);
        }
        return findGCD(so,se);
    }
    public int findGCD(int a, int b) 
    {
        int g=1;
        for(int i=1;i<=a && i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            {
                g=i;
            }
        }
        return g;
    }
}
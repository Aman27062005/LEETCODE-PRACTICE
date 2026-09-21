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
        while(b != 0)
        {
        int temp = b;
        b = a % b;
        a = temp;
        }
    return a;
    }
}
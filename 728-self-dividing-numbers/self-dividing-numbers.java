class Solution {
    public List<Integer> selfDividingNumbers(int left, int right)
    {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(selfdivide(i))
            {
                l.add(i);
            }
        }
        return l;
    }
    public static boolean selfdivide(int n)
    {
        int or=n;
        while(n>0)
        {
            int r=n%10;
            if(r==0 || or%r!=0)
            {
                return false;
            }
            n/=10;
        }
        return true;
    }

}
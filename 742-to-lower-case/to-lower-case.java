class Solution {
    public String toLowerCase(String s) 
    {
        String str="";
        for(int i=0;i<s.length();i++)
        {
            int x=s.charAt(i);
            if(x>=65 && x<=90)
            {
                x+=32;
                str=str+(char)x;
            }
            else
            {
                str=str+(char)x;
            }
        }
        return str;
    }
}
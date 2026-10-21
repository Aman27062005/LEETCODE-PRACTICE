class Solution {
    public int[] constructRectangle(int area) 
    {
        int w = (int)Math.sqrt(area);
        int l = area;
        int arr[] = new int[2];
        while(area % w != 0)
        {
            w--;
        }
        l = area / w;
        arr[0] = l;
        arr[1] = w;
        return arr;
    }
}
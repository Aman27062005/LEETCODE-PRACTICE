class Solution 
{
    public int[] sortArray(int[] nums) 
    {
        return mergeSort(nums,0,nums.length-1);
    }
    public static int[] mergeSort(int nums[],int s,int e)
    {
        if(s>=e)
        {
            return nums;
        }
        int mid=s+(e-s)/2;
        mergeSort(nums,s,mid);
        mergeSort(nums,mid+1,e);
        merge(nums,s,mid,e);
        return nums;
    }
    public static void merge(int arr[],int s,int mid,int e)
    {
        int temp[]=new int[e-s+1];
        int i=s;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=e)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
            }
            else
            {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid)
        {
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=e)
        {
            temp[k]=arr[j];
            j++;
            k++;
        }
        for(k=0,i=s;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];
        }
    }
}
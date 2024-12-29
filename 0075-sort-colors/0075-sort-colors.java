class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length-1;
        while(mid<=end)
        {
            switch(nums[mid])
            {
                case 0:
                swap(nums,start,mid);
                start++;
                mid++;
                break;
                case 1:
                mid++;
                break;
                case 2:
                swap(nums,mid,end);
                end--;
                break;
            }
        }
        
    }
    public static void swap(int num[],int pos1,int pos2)
    {
        int t = num[pos1];
        num[pos1] = num[pos2];
        num[pos2] = t;

    }
}
class Solution {
    static void swap(int nums[],int index1,int index2)
    {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int end = nums.length-1;
        while(mid<=end)
        {
            switch(nums[mid]){
                case 0:
                swap(nums,low,mid);
                low++;
                mid++;
                break;
                case 1:
                mid++;
                break;
                case 2:
                swap(nums,mid,end);
                end --;
                break;
            }
        }
        
    }
}
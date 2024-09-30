class Solution {
    public int[] sortArrayByParity(int[] nums){
        int left = 0;
        int right = nums.length-1;
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                arr[left++] = nums[i];
            }
            else
            {
                arr[right--] = nums[i];
            }
        }
        return arr;
    }
}
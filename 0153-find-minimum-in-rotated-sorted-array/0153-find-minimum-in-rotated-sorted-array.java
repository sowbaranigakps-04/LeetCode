class Solution {
    public int findMin(int[] nums) {

        int result = Integer.MAX_VALUE;
        
        int left = 0;
        int right = nums.length-1;
        while(left<=right)
        {
            int mid = (left+right)/2;

            if(nums[left]<=nums[mid])
            {
                result = Math.min(result,nums[left]);
                left = mid+1;
            }

            else
            {
                result = Math.min(result,nums[mid]);
                right = mid-1;
            }
        }
        return result;
    }
}
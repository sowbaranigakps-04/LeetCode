class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++)
            nums[i] = nums[i] * nums[i];

        int result[] = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int pos = nums.length - 1;

        while(left <= right){
            if(nums[left] > nums[right])
            {
                result[pos--] = nums[left];
                left++;
            }

            else{
                result[pos--] = nums[right];
                right--;
            }
        }

        return result;
        
    }
}
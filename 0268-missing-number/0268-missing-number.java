class Solution {
    public int missingNumber(int[] nums) {
        int arraySum = 0;
        for(int num : nums)
        {
            arraySum+=num;
        }
        int l = nums.length;
        int totalSum = l*(l+1)/2;
        return totalSum - arraySum;
        
    }
}
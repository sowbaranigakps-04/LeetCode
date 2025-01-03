class Solution {
    public int waysToSplitArray(int[] nums) {
        long totalSum = 0;
        for(int i=0;i<nums.length;i++)
        {
            totalSum+=nums[i];
        }
        long leftSum = 0;
        int count = 0;
        for(int i=0;i<=nums.length-2;i++)
        {
            leftSum +=nums[i];
            totalSum-=nums[i];
            if(leftSum>=totalSum)
                count++;        
        }
        return count;
    }
}
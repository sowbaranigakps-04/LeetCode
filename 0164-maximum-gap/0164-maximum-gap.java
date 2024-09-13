class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        if(nums.length<2)
            return 0;
        else
        {
            for(int i=1;i<nums.length;i++)
            {
                if(nums[i]-nums[i-1]>max)
                    max = nums[i]-nums[i-1];
            }
        }
        return max;
        
    }
}
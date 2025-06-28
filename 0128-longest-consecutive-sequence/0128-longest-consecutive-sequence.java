class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int longest = 1;
        int cnt = 0;
        int lastSmall = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]-1 == lastSmall)
            {
                cnt++;
                lastSmall = nums[i];
            }
            else if(nums[i]!=lastSmall)
            {
                lastSmall = nums[i];
                cnt = 1;
            }
            longest = Math.max(longest,cnt);
        }
        return longest;
    }
}
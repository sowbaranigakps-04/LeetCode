class Solution {
    public int majorityElement(int[] nums) {
        int ele = nums[0];
        int cnt = 1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] == ele)
                cnt++;
            if(nums[i]!=ele)
                cnt--;
            if(cnt == 0)
            {
                ele = nums[i];
                cnt = 1;
            }
        }
        return ele;
    }
}
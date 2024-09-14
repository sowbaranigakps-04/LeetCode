class Solution {
    public int longestSubarray(int[] nums) {
        int count = 0;
        int Maxele = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            Maxele = Math.max(nums[i],Maxele);
        }
        int Maxcount = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==Maxele)
                count++;
            else
            {
                Maxcount = Math.max(Maxcount,count);
                count = 0;
            }
        }
        Maxcount = Math.max(Maxcount,count);
        
        return Maxcount;
    }
}
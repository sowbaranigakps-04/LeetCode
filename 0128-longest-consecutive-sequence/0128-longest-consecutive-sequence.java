class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        int longest = 0;
        int length = 0;
        for(int num : nums)
        {
            if(!set.contains(num-1))
            {
                 length = 1;
                int temp = num;
                while(set.contains(temp+1))
                {
                    length++;
                    temp = temp+1;
                }
            }
            longest = Math.max(longest,length);

        }
        return longest;
    }
}
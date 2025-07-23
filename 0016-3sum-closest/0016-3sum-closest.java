class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = Integer.MAX_VALUE;
        int result = nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++)
        {
            int left = i+1;
            int right = nums.length-1;
            while(left<right){

                int sum = nums[i]+nums[left]+nums[right];
                
                if(sum == target)
                    return target;
                else if(sum>target)
                    right --;
                else
                    left++;
                
                int diff = Math.abs(target - sum);
                if(diff<closest)
                {
                    closest = diff;
                    result = sum;
                }
            }
        }
        return result;
    }
}
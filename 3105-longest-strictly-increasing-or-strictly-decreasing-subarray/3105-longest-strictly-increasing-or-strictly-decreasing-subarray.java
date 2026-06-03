class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int longest = 1;
        int strictlyIncreasing = 1;
        int strictlyDecreasing  = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1]){
                strictlyIncreasing++;
                strictlyDecreasing = 1;
            }

            else if(nums[i] < nums[i-1]){
                strictlyIncreasing = 1;
                strictlyDecreasing++;
            }

            else{
                 strictlyIncreasing = 1;
                strictlyDecreasing = 1;
            }

            longest = Math.max(Math.max(longest, strictlyIncreasing), strictlyDecreasing);
        }

        return longest;
    }
}
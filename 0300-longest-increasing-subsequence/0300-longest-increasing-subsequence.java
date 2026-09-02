class Solution {
    public int lengthOfLIS(int[] nums) {
        int value[] = new int[nums.length];
        for(int i = 1; i < nums.length; i++)
        {
            for(int j = 0; j < i; j++){
                if(nums[j] < nums[i]){
                    if(value[j] + 1 > value[i])
                        value[i] = value[j] + 1;
                }
            }
        }

        int maxIndex = 0;
        for(int i = 1 ; i < value.length; i++){
            if(value[i] > value[maxIndex])
                maxIndex = i;
        }

        return value[maxIndex] + 1;
    }
}
class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;

        for(int num : nums)
            sum += num;

        if(sum % 2 != 0)
            return false;
        
        int dp[][] = new int [nums.length][(sum/2) + 1];

        for(int i = 0; i < nums.length; i++)
            dp[i][0] = 1;

        for(int j = 1; j <= (sum/2); j++){
            if(nums[0] == j)
                dp[0][j] = 1;
            else
                dp[0][j] = 0;
        }

        for(int i = 1; i < nums.length; i++){
            for(int j = 1; j <= (sum/2); j++){
                if(j < nums[i])
                    dp[i][j] = dp[i-1][j];
                else if(dp[i-1][j] == 1)
                    dp[i][j] = 1;
                else
                    dp[i][j] = dp[i-1][j - nums[i]];
            }
        }

        if(dp[nums.length - 1][sum/2] == 1)
            return true;
        else
            return false;
    }
}
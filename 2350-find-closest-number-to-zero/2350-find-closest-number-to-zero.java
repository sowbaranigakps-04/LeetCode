class Solution {
    public int findClosestNumber(int[] nums) {
        int minDiff = Integer.MAX_VALUE;
        int result = 0;
        for(int num : nums){
           int diff = Math.abs(num - 0);
           if(diff < minDiff){
                minDiff = diff;
                result = num;
           }

           else if(diff == minDiff){
                result = Math.max(result,num);
           }
        }

        return result;
    }
}
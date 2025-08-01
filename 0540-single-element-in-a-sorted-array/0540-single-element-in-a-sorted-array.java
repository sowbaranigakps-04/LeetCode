class Solution {
    public int singleNonDuplicate(int[] nums) {
        int xor = 0;
        for(int num : nums){
            xor = xor ^ num;
        }
        return xor;
    }
}
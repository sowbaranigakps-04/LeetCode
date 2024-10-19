class Solution {
    public int findLucky(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max = -1;
        for(var m : map.entrySet())
        {
            if(m.getKey()==m.getValue())
                max = Math.max(max,m.getKey());
        }
        return max;
    }
}
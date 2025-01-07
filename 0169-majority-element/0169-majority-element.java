class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num : nums)
        {
            if(map.get(num)>Math.floor(nums.length/2))
                return num;
        }
        return 0;

        
    }
}
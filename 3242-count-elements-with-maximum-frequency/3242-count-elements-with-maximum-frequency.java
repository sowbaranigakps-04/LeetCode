class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        int Max = 0;

        for(var m : map.entrySet())
        {
            if(m.getValue()>Max)
                Max = m.getValue();
        }

        int count = 0;
        for(var m : map.entrySet())
        {
            if(m.getValue()==Max)
                count++;
        }
        return count*Max;
    }
}
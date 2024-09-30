class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int num : nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(var m : map.entrySet())
        {
            if(m.getValue()==2)
                list.add(m.getKey());
        }
        return list;
    }
}
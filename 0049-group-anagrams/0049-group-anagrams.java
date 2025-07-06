class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s : strs)
        {
            char key[] = s.toCharArray();
            Arrays.sort(key);
            String Key = new String(key);
            
            if(!map.containsKey(Key))
            {
                map.put(Key,new ArrayList<>());
            }
            map.get(Key).add(s);

        }
        return new ArrayList<>(map.values());
    }
}
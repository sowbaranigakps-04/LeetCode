class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(char i : jewels.toCharArray())
        {
            set.add(i);
        }
        for(int i=0;i<stones.length();i++)
        {
            char ch = stones.charAt(i);
            if(set.contains(ch))
                count++;
        }
        return count;
    }
}
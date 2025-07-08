class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int start = 0;
        int end = 0;
        int max = 0;
        while(end < s.length())
        {
            char c = s.charAt(end);
            while(set.contains(c))
            {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(c);
            max = Math.max(max,end-start+1);
            end++;
        }
        return max;
    }
}
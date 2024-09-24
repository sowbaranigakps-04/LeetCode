class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        for(int i=0;i<=s.length()-3;i++)
        {
            char ch = s.charAt(i);
            char ch1 = s.charAt(i+1);
            char ch2 = s.charAt(i+2);
            if(ch!=ch1 && ch1!=ch2 && ch2!=ch)
                count++;
        }
        return count;
        
    }
}
class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch))
                count++;
        }
        if(count == word.length() || (count==1 && Character.isUpperCase(word.charAt(0))) || count == 0)
        return true;
        else
            return false;
    }
}
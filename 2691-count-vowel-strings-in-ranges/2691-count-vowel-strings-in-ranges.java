class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int prefix[] = new int[words.length+1];
        int result[] = new int[queries.length];
        int sum = 0;
        for(int i=0;i<words.length;i++)
        {
            prefix[i] = sum;
            String word = words[i];
            int length = word.length();
            if(isVowel(word.charAt(0)))
            {
                if(isVowel(word.charAt(length-1)))
                    sum++;
            }
        }
        prefix[prefix.length-1] = sum;

        for(int i=0;i<queries.length;i++)
        {
            int l = queries[i][0];
            int r = queries[i][1];
            result[i] = prefix[r+1] - prefix[l];
        }
        return result;

    }
    public static boolean isVowel(char c)
    {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
             return true;
        else
            return false;
    
    }
        
        
    
}
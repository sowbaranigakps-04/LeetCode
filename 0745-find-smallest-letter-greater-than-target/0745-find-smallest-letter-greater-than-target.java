class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char result = '{';
        for(int i=0;i<letters.length;i++)
        {
            if(result>letters[i] && letters[i]>target)
            {
                result = letters[i];
            }
        }
        if(result=='{')
            return letters[0];
        return result;
        
    }
   
}
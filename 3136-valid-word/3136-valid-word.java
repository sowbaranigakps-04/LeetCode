class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3)
            return false;

        int vowel = 0;
        int consonant = 0;

        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(!Character.isLetterOrDigit(ch))
                return false;

            else if(!Character.isDigit(ch))
            {
                if(isVowel(ch))
                    vowel ++;
                else
                    consonant ++;
            }
        }
        return vowel >= 1 && consonant >= 1;
    }

    boolean isVowel(char c)
    {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
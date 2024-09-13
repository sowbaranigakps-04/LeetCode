class Solution {
    public String reverseOnlyLetters(String s) {
        String rev = "";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isLetter(ch))
            {
                sb.append(ch);
            }
        }
        sb.reverse();
        StringBuilder res = new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isLetter(ch))
            {
                res.append(sb.charAt(j));
                j++;
            }
            else
                res.append(s.charAt(i));
        }
        return res.toString();
    }
}
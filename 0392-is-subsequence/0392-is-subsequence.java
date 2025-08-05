class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int j = 0;
        int cnt = 0;
        if(s.length() == 0)
            return true;
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i) == s.charAt(j))
            {
                cnt++;
                // if(j<s.length()-1)
                // {
                //     j++;
                // }
                if(cnt == s.length())
                    break;
                j++;

            }

        }

        if(cnt == s.length())
            return true;
        return false;
    }
}
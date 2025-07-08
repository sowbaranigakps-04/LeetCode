class Solution {

    static int findOccurence(String s, String part)
    {
        int n = s.length();
        int m = part.length();
        for(int i=0;i<=n-m;i++)
        {
            int j;
            for(j=0;j<m;j++)
            {
                if(s.charAt(i+j)!=part.charAt(j))
                    break;
            }
            if(j == m)
                return i;
        }
        return -1;

    }

    public String removeOccurrences(String s, String part) {
        while(true)
        {
            int index = findOccurence(s,part);
            if(index == -1)
                break;
            s = s.substring(0,index)+s.substring(index+part.length());
        }
        return s;
    }
}
class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0)
            return 0;
        int Sign = 1;
        int i = 0;
        int count = 0;
        if(s.charAt(0)=='-')
        {
            Sign = -1;
            i++;
        }
        if(s.charAt(0)=='+')
        {
            Sign = 1;
            i++;
        }
        while(i<s.length())
        {
            if(!Character.isDigit(s.charAt(i)))
                break;
            int n = s.charAt(i)-'0';
            if (count > (Integer.MAX_VALUE - n) / 10) 
                return (Sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            count = count*10+n;
            i++;
        }
        return count * Sign;
    }
}
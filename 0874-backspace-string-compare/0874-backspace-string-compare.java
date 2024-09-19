class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1 = isEqual(s);
        String s2 = isEqual(t);
        return s1.equals(s2);  
    }
    public static String isEqual(String s)
    {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch!='#')
                st.push(ch);
            else
            {
                if(!st.isEmpty())
                    st.pop();
                else
                    continue;
            }
        }
        String res = "";
        while(!st.isEmpty())
        {
            res = st.pop()+res;
        }
        return res;
    }
}
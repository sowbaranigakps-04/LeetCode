class Solution {
    public String reverseWords(String s) {
        String str[]=s.trim().split(" +");
        String rev="";
        for(int i=str.length-1;i>0;i--)
        {
            rev+=str[i]+" ";
            
        }
        return rev+str[0];
        
    }
}
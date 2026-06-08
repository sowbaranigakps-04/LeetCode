class Solution {
    public String maximumOddBinaryNumber(String s) {

        int zeroCount = 0;
        int oneCount = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0')
                zeroCount++;
            else
                oneCount++;
        }
        
        StringBuilder sb = new StringBuilder();

        sb.append("1".repeat(oneCount - 1));
        sb.append("0".repeat(zeroCount));
        sb.append("1");

        return new String(sb);

    }
}
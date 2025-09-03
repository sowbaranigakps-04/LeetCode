class Solution {
    public int maxDiff(int num) {
        String string = String.valueOf(num);
        char firstNonNine = ' ';
        for(int i=0;i<string.length();i++){
            if(string.charAt(i) != '9'){
                firstNonNine = string.charAt(i);
                break;
            }
        }

        char minDigit = string.charAt(0);
        char replace = '1';

        if(minDigit == '1'){
            for(int i=0;i<string.length();i++){
                if(string.charAt(i) != '1' && string.charAt(i) != '0'){
                    minDigit = string.charAt(i);
                    replace = '0';
                    break;
                }
            }
        }

        StringBuilder max = new StringBuilder();
        StringBuilder min = new StringBuilder();

        for(int i=0;i<string.length();i++){
            char ch1 = string.charAt(i) == firstNonNine ? '9' : string.charAt(i);
            max.append(ch1);

            char ch2 = string.charAt(i) == minDigit ? replace : string.charAt(i);
            min.append(ch2);
        }

        return Integer.parseInt(max.toString()) - Integer.parseInt(min.toString());
    }
}
class Solution {
    public int maxFreqSum(String s) {
        int freq[] = new int[26];
        Character vowels[] = {'a','e','i','o','u'};
        List<Character> list = Arrays.asList(vowels);

        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }

        int maxV = Integer.MIN_VALUE;
        int maxC = Integer.MIN_VALUE;

        for(int i=0;i<26;i++){

            char c = (char) (i + 'a');

            if(list.contains(c))
                maxV = Math.max(maxV,freq[i]);
            else
                maxC = Math.max(maxC,freq[i]);
        }

        return maxC+maxV;
    }
}
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {

        String words[] = text.split(" ");

        int count = 0;

        for(int j=0;j<words.length;j++){

            boolean found = false;

            for(int i=0;i<brokenLetters.length();i++){
                char c = brokenLetters.charAt(i);
                if(words[j].indexOf(c) != -1){
                    found = true;
                    break;
                }
            }

            if(!found)
                count++;
        }
        
        return count;
    }
}
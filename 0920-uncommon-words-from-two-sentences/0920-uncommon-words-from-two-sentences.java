class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        String str1[] = s1.split(" ");
        String str2[] = s2.split(" ");
        for(int i=0;i<str1.length;i++)
        {
            map1.put(str1[i],map1.getOrDefault(str1[i],0)+1);
        }

        for(int i=0;i<str2.length;i++)
        {
            map2.put(str2[i],map2.getOrDefault(str2[i],0)+1);
        }
        List<String> list = new ArrayList<>();
        for(var m : map1.entrySet())
        {
            String word = m.getKey();
            int freq = m.getValue();
            if(freq==1 && !map2.containsKey(word))
                list.add(word);
        }

        for(var m1 : map2.entrySet())
        {
            String word = m1.getKey();
            int freq = m1.getValue();
            if(freq==1 && !map1.containsKey(word))
                list.add(word);
        }
        return list.stream().toArray(String[]::new);
    }
}
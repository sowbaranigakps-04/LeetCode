class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],1);
        }
        int i = 1;
        for(Map.Entry<Integer,Integer> m : map.entrySet())
        {
            map.put(m.getKey(),i);
            i++;
        }
        for(i=0;i<arr.length;i++)
        {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();
        int [] lastAddedInterval = intervals[0];
        result.add(lastAddedInterval);

        for(int interval[] : intervals){
            if(interval[0] <= lastAddedInterval[1])
                lastAddedInterval[1] = Math.max(lastAddedInterval[1], interval[1]);
            else{
                lastAddedInterval = interval;
                result.add(lastAddedInterval);
            }
        } 
       return result.toArray(new int[result.size()][2]);
    }
}
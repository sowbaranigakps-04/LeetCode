class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = queries.length;
        int xor[] = new int[n];
        for(int i=0;i<n;i++)
        {
                int result = 0;
                int start = queries[i][0];
                int end =   queries[i][1];
                for(int j=start;j<=end;j++)
                {
                    result = result^arr[j];
                }
                xor[i] = result;
        }
        return xor;
        
    }
}
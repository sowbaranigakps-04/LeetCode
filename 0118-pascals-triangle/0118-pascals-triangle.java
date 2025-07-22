class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new ArrayList<>();
        for(int i=1;i<=numRows;i++)
        {
            int ans = 1;
            List<Integer> res = new ArrayList<>();
            res.add(ans);
            for(int j=1;j<i;j++)
            {
                ans = ans*(i-j);
                ans = ans/j;
                res.add(ans);
            }
            list.add(res);

        } 
        return list;
        
    }
}
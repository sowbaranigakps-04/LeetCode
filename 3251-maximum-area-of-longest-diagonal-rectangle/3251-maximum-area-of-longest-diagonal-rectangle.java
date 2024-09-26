class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double Max = 0;
        int MaxArea = 0;
        for(int i=0;i<dimensions.length;i++)
        {
          int l= dimensions[i][0];
          int w = dimensions[i][1];
          int area = l*w;
          double dl = Math.sqrt(l*l+w*w);
          if(dl>Max || (Max == dl && area>MaxArea))
          {
            Max = dl;
            MaxArea = area;
          }
        }
        return MaxArea;
    }
}
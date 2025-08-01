class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1)
            return x;
        int start =1;
        int end = x;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if((long)mid*mid == x)
                return mid;
            else if((long)mid*mid<x)
                start = mid+1;
            else if((long)mid*mid>x)
                end = mid-1;
        }
        return Math.round(end);
    }
}
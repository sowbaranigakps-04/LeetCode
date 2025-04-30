class Solution {
    public boolean lemonadeChange(int[] bills) {

        int fiveDollar = 0;
        int tenDollar = 0;
        for(int dollar : bills)
        {
            if(dollar == 5)
                fiveDollar++;
            else if(dollar == 10)
            {
                if(fiveDollar>=1)
                {
                    fiveDollar--;
                    tenDollar++;
                }
                else 
                    return false;
            }
            else
            {
                if(tenDollar>=1 && fiveDollar>=1)
                {
                    tenDollar--;
                    fiveDollar--;
                }
                else if(fiveDollar>=3)
                {
                    fiveDollar-=3;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
        
    }
}
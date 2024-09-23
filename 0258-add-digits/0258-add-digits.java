class Solution {
    public int addDigits(int num) {
        int Sum=0;
        if(num<=9)
            return num;
        while(num>0)
        {
            Sum+=num%10;
            num=num/10;
            if(Sum>9 && num==0)
            {
                num = Sum;
                Sum = 0;
            }

        }
        return Sum;
    }
}
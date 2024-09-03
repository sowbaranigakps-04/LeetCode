class Solution {
    public int getLucky(String s, int k) {
        int initialSum = 0;
        for(int i=0;i<s.length();i++)
        {
            int Value = s.charAt(i)-'a'+1;
            while(Value>0)
            {
                initialSum+=Value%10;
                Value/=10;
            }

        }

        while(k>1)
        {
            int Sum = 0;
            while(initialSum>0)
            {
                Sum+=initialSum%10;
                initialSum/=10;
            }
            initialSum = Sum;
            k--;
        }
        return initialSum;
        
    }
}
class Solution {
    public int reverse(int x){

        int num = Math.abs(x);
        long reverse = 0;
        while(num>0)
        {
            int rem = num%10;
            reverse = reverse*10 + rem;
            num = num/10;
            if(reverse> Integer.MAX_VALUE || reverse<Integer.MIN_VALUE)
                return 0;
        }
        if(x<0)
            return (int)Math.negateExact(reverse);
        else
            return (int)reverse;
        
    }
}
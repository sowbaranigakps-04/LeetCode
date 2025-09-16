class Solution {

    public static int gcd(int a,int b){
        if(b == 0)
            return a;
        return gcd(b,a%b);
    }

    public List<Integer> replaceNonCoprimes(int[] nums) {
        
        List<Integer> list  = new ArrayList<>();
        for(int num : nums){
            list.add(num);
        

        while(list.size()>1){
            int num1 = list.get(list.size()-1);
            int num2 = list.get(list.size()-2);

            int gcd = gcd(num1,num2);


            if(gcd == 1)
                break;

            int lcm = num1/gcd*num2;

            list.remove(list.size()-1);
            list.remove(list.size()-1);

            list.add((int)lcm);
        }
    }

        return list;
    }
}
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0;
        int cnt2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(cnt1 == 0 && nums[i] != el2)
            {
                cnt1 = 1;
                el1 = nums[i];
            }
            else if(cnt2 == 0 && nums[i] != el1)
            {
                cnt2 = 1;
                el2 = nums[i];
            }
            else if(nums[i] == el1)
                cnt1++;
            else if(nums[i] == el2)
                cnt2++;
            else
            {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == el1)
                cnt1++;
            else if(nums[i] == el2)
                cnt2++;
        }
        int min = nums.length/3;

        List<Integer> list = new ArrayList<>();

        if(cnt1>min)
            list.add(el1);
        if(cnt2>min)
            list.add(el2);
        return list;

    }
}
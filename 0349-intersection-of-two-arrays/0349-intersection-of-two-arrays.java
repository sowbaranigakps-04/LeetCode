class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i]))
            {
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }

        int result[] = new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            result[i] = list.get(i);
        }

        return result;
    }
}
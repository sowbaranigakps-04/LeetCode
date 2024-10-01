class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] freq = new int[k];

        // Calculate remainder frequencies
        for (int num : arr) {
            int remainder = ((num % k) + k) % k; //Handle negative numbers
            freq[remainder]++;
        }

        // Check if pairs can be formed
        for (int i = 1; i < k; i++) {
            if (freq[i] != freq[k - i]) {
                return false;
            }
        }

        // Handle special case for remainder 0
        if (freq[0] % 2 != 0) {
            return false;
        }

        return true;
    }
}
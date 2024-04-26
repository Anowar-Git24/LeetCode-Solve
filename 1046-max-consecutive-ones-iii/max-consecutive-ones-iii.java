class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int zeros = 0;

        while (r < nums.length) {
            if (nums[r] == 0) {
                zeros++;
            }
            r++;
            if (zeros > k) {
                if (nums[l] == 0) {
                    zeros--;
                }
                l++;
            }

        }
        return r - l;
    }
}
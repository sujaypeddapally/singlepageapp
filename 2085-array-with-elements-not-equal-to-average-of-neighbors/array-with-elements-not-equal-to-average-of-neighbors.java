class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        int[] ans = new int[nums.length];
        int left = 0;
        int right = (nums.length + 1) / 2;
        int index = 0;
        while (left < (nums.length + 1) / 2 || right < nums.length) {
            if (left < (nums.length + 1) / 2)
                ans[index++] = nums[left++];
            if (right < nums.length)
                ans[index++] = nums[right++];
        }
        return ans;
    }
}
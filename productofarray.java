class productofarray {
    public int[] productExceptSelf(int[] nums) {
        int a = nums.length;
        int[] ans = new int[a];
        ans[0] = 1;
        for (int i = 1; i < a; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }
        int suffix = 1;
        for (int i = a - 1; i >= 0; i--) {
            ans[i] = ans[i] * suffix;
            suffix *= nums[i];
        }
        return ans;
    }
}
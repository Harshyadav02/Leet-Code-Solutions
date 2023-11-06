class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }

        int max_product = nums[0];
        int min_product = nums[0];
        int result = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] < 0) {
                // Swap max_product and min_product when encountering a negative number.
                int temp = max_product;
                max_product = min_product;
                min_product = temp;
            }

            // Update max_product and min_product for the current element.
            max_product = Math.max(nums[i], max_product * nums[i]);
            min_product = Math.min(nums[i], min_product * nums[i]);

            // Update the result with the maximum product.
            result = Math.max(result, max_product);
        }

        return result;
    }
}

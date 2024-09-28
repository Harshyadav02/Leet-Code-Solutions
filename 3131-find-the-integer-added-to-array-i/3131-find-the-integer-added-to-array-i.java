
class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {

        return Arrays.stream(nums2).min().orElseThrow() - Arrays.stream(nums1).min().orElseThrow();
    }
}

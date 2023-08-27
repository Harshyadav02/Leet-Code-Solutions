class Solution {

    public int[] searchRange(int[] nums, int target) {
        int first_occurrence = firstOccurrence(nums, target, 0, nums.length - 1);
        int last_occurrence = lastOccurrence(nums, target, 0, nums.length - 1);
        int[] result = {first_occurrence, last_occurrence};
        return result;
    }

    public static int firstOccurrence(int[] arr, int key, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == key) {
            if (mid == low || arr[mid - 1] != key) {
                return mid;
            } else {
                return firstOccurrence(arr, key, low, mid - 1);
            }
        } else if (arr[mid] < key) {
            return firstOccurrence(arr, key, mid + 1, high);
        } else {
            return firstOccurrence(arr, key, low, mid - 1);
        }
    }

    public static int lastOccurrence(int[] arr, int key, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == key) {
            if (mid == high || arr[mid + 1] != key) {
                return mid;
            } else {
                return lastOccurrence(arr, key, mid + 1, high);
            }
        } else if (arr[mid] < key) {
            return lastOccurrence(arr, key, mid + 1, high);
        } else {
            return lastOccurrence(arr, key, low, mid - 1);
        }
    }
}

class Solution {
  
    public int[] searchRange(int[] nums, int target) {
        int first_occurence = firstOccurance(nums, target, 0);
        int last_occurence = lastOccurence(nums, target, 0);

        int arr2[] = new int[2];

        arr2[0] = first_occurence;
        arr2[1] = last_occurence;

        return arr2;
    }

    // For first occurrence 
    public static int firstOccurance(int arr[], int keyElement, int i) {
        if (i == arr.length) return -1;

        if (arr[i] == keyElement) return i;

        return firstOccurance(arr, keyElement, i + 1);
    }

    // For last occurrence 
    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) return -1;

        int isFound = lastOccurence(arr, key, i + 1);
        
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }
}

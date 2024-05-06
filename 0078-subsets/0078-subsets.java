class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        set(nums, list, 0, new ArrayList<>());
        return list;
    }

    private void set(int[] arr, List<List<Integer>> final_list, int pointer, List<Integer> list) {
        if (pointer >= arr.length) {
            final_list.add(new ArrayList<>(list)); 
            return;
        }

        list.add(arr[pointer]); 
        set(arr, final_list, pointer + 1, list); 
        list.remove(list.size() - 1); 
        set(arr, final_list, pointer + 1, list); 
    }
}

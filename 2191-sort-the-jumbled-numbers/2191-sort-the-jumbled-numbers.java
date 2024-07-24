class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            StringBuilder helper = new StringBuilder(); 
            String numStr = Integer.toString(nums[i]);

            for (int index = 0; index < numStr.length(); index++) {
                int value = mapping[Character.getNumericValue(numStr.charAt(index))];
                helper.append(value);
            }

            list.add(new int[]{Integer.parseInt(helper.toString()), i});
        }

        list.sort((a, b) -> Integer.compare(a[0], b[0]));

        return list.stream()
                   .mapToInt(i -> nums[i[1]])
                   .toArray();
    }

}
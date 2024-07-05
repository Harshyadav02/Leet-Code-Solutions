class Solution {
    public int[] getNoZeroIntegers(int target) {
        for (int firstNumber = 1; firstNumber < target; firstNumber++) {
            int secondNumber = target - firstNumber;
            if (containsNoZero(firstNumber) && containsNoZero(secondNumber)) {
                return new int[]{firstNumber, secondNumber};
            }
        }
      
        return new int[]{target - 1, 1};
    }

    private boolean containsNoZero(int number) {
        while (number > 0) {
            if (number % 10 == 0) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}

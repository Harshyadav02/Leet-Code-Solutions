
public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> resultList = new ArrayList<>();

        for (int currentNum = left; currentNum <= right; currentNum++) {
            String numStr = String.valueOf(currentNum);

            if (numStr.contains("0")) {
                continue;
            } else {
                boolean isSelfDividing = true;
                for (char digitChar : numStr.toCharArray()) {
                    int digit = Character.getNumericValue(digitChar);
                    if (currentNum % digit != 0) {
                        isSelfDividing = false;
                        break;
                    }
                }
                if (isSelfDividing) {
                    resultList.add(currentNum);
                }
            }
        }

        return resultList;
    }
}

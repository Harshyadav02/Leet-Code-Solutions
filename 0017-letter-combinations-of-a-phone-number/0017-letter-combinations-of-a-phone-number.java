
public class Solution {
    public List<String> letterCombinations(String digits) {
        // Map for mapping digits to their corresponding letters
        Map<Character, String> dict1 = new HashMap<>();
        dict1.put('2', "abc");
        dict1.put('3', "def");
        dict1.put('4', "ghi");
        dict1.put('5', "jkl");
        dict1.put('6', "mno");
        dict1.put('7', "pqrs");
        dict1.put('8', "tuv");
        dict1.put('9', "wxyz");

        // Length of given digit
        int length = digits.length();

        // Final list to store the result
        List<String> finalList = new ArrayList<>();

        // If there are no digits
        if (digits.equals("")) {
            return finalList;
        }

        // If there's only 1 digit
        if (length == 1) {
            for (char c : dict1.get(digits.charAt(0)).toCharArray()) {
                finalList.add(String.valueOf(c));
            }
        }

        // If there are 2 digits
        if (length == 2) {
            for (char c1 : dict1.get(digits.charAt(0)).toCharArray()) {
                for (char c2 : dict1.get(digits.charAt(1)).toCharArray()) {
                    finalList.add(String.valueOf(c1) + c2);
                }
            }
        }

        // If there are 3 digits
        if (length == 3) {
            for (char c1 : dict1.get(digits.charAt(0)).toCharArray()) {
                for (char c2 : dict1.get(digits.charAt(1)).toCharArray()) {
                    for (char c3 : dict1.get(digits.charAt(2)).toCharArray()) {
                        finalList.add(String.valueOf(c1) + c2 + c3);
                    }
                }
            }
        }

        // If there are 4 digits
        if (length == 4) {
            for (char c1 : dict1.get(digits.charAt(0)).toCharArray()) {
                for (char c2 : dict1.get(digits.charAt(1)).toCharArray()) {
                    for (char c3 : dict1.get(digits.charAt(2)).toCharArray()) {
                        for (char c4 : dict1.get(digits.charAt(3)).toCharArray()) {
                            finalList.add(String.valueOf(c1) + c2 + c3 + c4);
                        }
                    }
                }
            }
        }

        // Return the final list
        return finalList;
    }
}

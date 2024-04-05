
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] sArray = s.split(" ");

        if (pattern.length() != sArray.length) {
            return false;
        }

        for (int index = 0; index < pattern.length(); index++) {
            char ch = pattern.charAt(index);

            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(sArray[index])) {
                    return false;
                }
            } else {
                if (map.containsValue(sArray[index])) {
                    return false;
                }
                map.put(ch, sArray[index]);
            }
        }

        return true;
    }
}

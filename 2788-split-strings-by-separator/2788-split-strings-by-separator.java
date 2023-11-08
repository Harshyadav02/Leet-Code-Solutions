
import java.util.regex.Pattern;

public class Solution {
    // Split words in the input list by a specified separator character
    // and exclude empty strings from the result.
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        ArrayList<String> list = new ArrayList<>();

        for (String ele : words) {
            // Split the current word using the specified separator and handle it as a regular expression pattern.
            String str[] = ele.split(Pattern.quote(String.valueOf(separator)));
            
            for (String s : str) {
                // Trim each resulting substring to remove leading and trailing whitespace.
                String trimmed = s.trim();
                // Check if the trimmed substring is not empty before adding it to the list.
                if (!trimmed.isEmpty()) {
                    list.add(trimmed);
                }
            }
        }

        return list;
    }
}

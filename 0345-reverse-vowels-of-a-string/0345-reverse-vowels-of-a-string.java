class Solution {
    public String reverseVowels(String s) {
       
        // Create an ArrayList to store vowels
        ArrayList<Character> list = new ArrayList<>();
        
        // Convert the input string to a character array
        char ch[] = s.toCharArray();

        // Iterate through each character in the array
        for(int i=0; i<ch.length; i++){

            // Check if the current character is a vowel (either lowercase or uppercase)
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A'|| ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U'){

                // If a vowel is found, add it to the ArrayList and replace it in the array with '_'
                list.add(ch[i]);
                ch[i] = '_';
            }
        }

        // Initialize an index to traverse the vowel list in reverse
        int j = list.size() - 1;

        // Iterate through the character array again
        for(int i = 0; i < ch.length; i++){

            // Check if the current character is a placeholder ('_')
            if(ch[i] == '_'){

                // Replace the placeholder with the reversed vowel from the ArrayList
                ch[i] = list.get(j--);
            }
        }

        // Convert the modified character array back to a string and return
        return new String(ch);
    }
}

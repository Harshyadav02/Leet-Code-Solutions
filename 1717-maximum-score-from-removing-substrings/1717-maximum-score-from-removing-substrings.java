// class Solution {
//     String maxString;
//     public int maximumGain(String s, int x, int y) {
//         StringBuilder sb = new StringBuilder(s);
//         int points = 0;
//         int max = Math.max(x,y);
//         int min = Math.min(x,y);
//         if(x>y) {
//             maxString = "ab";
//         }
//         else{
//             maxString = "ba";
//         }

//         while(true){
        
//             int index = sb.indexOf(maxString);
//             if (index == -1) {
//                 break;
//             }
//             sb.delete(index, index + 2);
//             points += max;
//         }
        
//         if(maxString == "ab"){

//             while(true){
        
//                 int index = sb.indexOf("ba");
//                 if (index == -1) {
//                     break;
//                 }
//                 sb.delete(index, index + 2);
//                 points += min;
//             }
//         }
//         if(maxString == "ba"){

//             while(true){
        
//                 int index = sb.indexOf("ab");
//                 if (index == -1) {
//                     break;
//                 }
//                 sb.delete(index, index + 2);
//                 points += min;
//             }
//         }

//         return points;
//     }
// }


import java.util.Stack;

class Solution {
    String maxString;
    
    public int maximumGain(String s, int x, int y) {
        Stack<Character> stack = new Stack<>();
        int points = 0;
        int max = Math.max(x, y);
        int min = Math.min(x, y);
        
        if (x > y) {
            maxString = "ab";
        } else {
            maxString = "ba";
        }

        // First pass to remove max valued pairs
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == maxString.charAt(0) && c == maxString.charAt(1)) {
                stack.pop();
                points += max;
            } else {
                stack.push(c);
            }
        }
        
        // Convert remaining stack to a string
        StringBuilder remainingSb = new StringBuilder();
        while (!stack.isEmpty()) {
            remainingSb.insert(0, stack.pop());
        }

        // Second pass to remove remaining pairs with min value
        for (char c : remainingSb.toString().toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == (maxString.equals("ab") ? 'b' : 'a') && c == (maxString.equals("ab") ? 'a' : 'b')) {
                stack.pop();
                points += min;
            } else {
                stack.push(c);
            }
        }

        return points;
    }
}

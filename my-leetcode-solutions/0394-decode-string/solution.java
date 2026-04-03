// import java.util.*;

// class Solution {
//     public String decodeString(String s) {
//         Stack<Integer> countStack = new Stack<>();
//         Stack<String> stringStack = new Stack<>();

//         String currentString = "";
//         int currentNumber = 0;

//         for (char ch : s.toCharArray()) {

//             if (Character.isDigit(ch)) {
//                 currentNumber = currentNumber * 10 + (ch - '0');
//             }

//             else if (ch == '[') {
//                 countStack.push(currentNumber);
//                 stringStack.push(currentString);

//                 currentNumber = 0;
//                 currentString = "";
//             }

//             else if (ch == ']') {
//                 int repeat = countStack.pop();
//                 String prev = stringStack.pop();

//                 String temp = "";
//                 for (int i = 0; i < repeat; i++) {
//                     temp += currentString;
//                 }

//                 currentString = prev + temp;
//             }

//             else {
//                 currentString += ch;
//             }
//         }

//         return currentString;
//     }
// }
class Solution {
    int i = 0;

    public String decodeString(String s) {
        String result = "";

        while (i < s.length() && s.charAt(i) != ']') {

            if (Character.isDigit(s.charAt(i))) {
                int num = 0;

                while (Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }

                i++; // skip '['

                String inner = decodeString(s); // recursion

                i++; // skip ']'

                for (int j = 0; j < num; j++) {
                    result += inner;
                }

            } else {
                result += s.charAt(i);
                i++;
            }
        }

        return result;
    }
}

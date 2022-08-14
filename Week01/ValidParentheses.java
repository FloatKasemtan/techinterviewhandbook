package Week01;

import java.util.HashMap;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> parenthesis = new HashMap<Character, Character>();
        parenthesis.put(')', '(');
        parenthesis.put('}', '{');
        parenthesis.put(']', '[');
        if (s.length() % 2 != 0)
            return false;
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (parenthesis.containsKey(chars[i])) {
                if (stack.isEmpty() || stack.pop() != parenthesis.get(chars[i]))
                    return false;

            } else {
                stack.push(chars[i]);
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}

public class ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // Test case goes here
        System.out.println(solution.isValid("){"));
    }
    // Runtime: 3 ms, faster than 62.77% of Java online submissions for Valid
    // Parentheses.
    // Memory Usage: 41.9 MB, less than 68.70% of Java online submissions for Valid
    // Parentheses.
    // Pretty satisfy with the result but found 2ms faster solution should have
    // think more simple
    // https://leetcode.com/problems/valid-parentheses/discuss/2421370/Java-Easy-to-read-solution-(90-faster-or-75-less-mem)
}

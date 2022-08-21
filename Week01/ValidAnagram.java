package Week01;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

class SolutionValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sA = s.toCharArray();
        char[] tA = t.toCharArray();
        Arrays.sort(sA);
        Arrays.sort(tA);
        return new String(sA).equals(new String(tA));
    }
}

public class ValidAnagram {
    public static void main(String[] args) {
        SolutionValidAnagram sol = new SolutionValidAnagram();
        // Test case goes here
        sol.isAnagram("anagram", "nagaram");
    }
//    Runtime: 2 ms, faster than 98.80% of Java online submissions for Valid Anagram.
//    Memory Usage: 42.7 MB, less than 90.29% of Java online submissions for Valid Anagram.

}

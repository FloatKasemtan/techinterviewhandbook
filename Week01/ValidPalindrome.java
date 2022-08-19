package Week01;

class SolutionValidPalimdrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        if (s.length() == 1 || s.length() == 0) {
            return true;
        }
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}

public class ValidPalindrome {
    public static void main(String[] args) {
        SolutionValidPalimdrome solution = new SolutionValidPalimdrome();
        long startTime = System.currentTimeMillis();
        System.out.println(
                solution.isPalindrome("A man, a plan, a canal: Panama"));

        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) + "ms");
        // Runtime: 742 ms, faster than 29.07% of Java online submissions for Valid
        // Palindrome.
        // Memory Usage: 47.4 MB, less than 25.76% of Java online submissions for Valid
        // Palindrome.
        // Not okay with the result, the problem might be their because regex

    }
}

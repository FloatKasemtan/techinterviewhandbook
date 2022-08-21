package Week01;

class SolutionValidPalimdrome {
    public boolean isPalindrome(String s) {
        int lPointer = 0;
        int rPointer = s.length()-1;
        s = s.toLowerCase();
        while (lPointer < rPointer) {
            if (!isCharacter(s.charAt(lPointer))){
                lPointer++;
                continue;
            }
            if (!isCharacter(s.charAt(rPointer))){
                rPointer--;
                continue;
            }
            if (s.charAt(lPointer) != s.charAt(rPointer))return false;

            lPointer++;
            rPointer--;
        }

        return true;
    }

    public boolean isCharacter(char character){
        return character >= 97 && character <= 122 || character >= 48 && character <= 57;
    }
}

public class ValidPalindrome {
    public static void main(String[] args) {
        SolutionValidPalimdrome solution = new SolutionValidPalimdrome();
        long startTime = System.currentTimeMillis();
        System.out.println(
                solution.isPalindrome("aa"));

        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) + "ms");
//        Runtime: 3 ms, faster than 98.90% of Java online submissions for Valid Palindrome.
//        Memory Usage: 42 MB, less than 99.40% of Java online submissions for Valid Palindrome.
//        Got better result using pointer
    }
}

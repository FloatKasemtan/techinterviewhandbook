public RansomNote{
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] characters = new int[26];
        int n = magazine.length();
        for (int i = 0; i < n; i++) {
            characters[magazine.charAt(i) - 'a']++;
        }

        n = ransomNote.length();

        for (int i = 0; i < n; i++) {
            if (--characters[ransomNote.charAt(i)-'a'] < 0) 
                return false;
        }
        return true;
    }
}
// Runtime 2 ms Beats 99.55%
// Memory 42.3 MB Beats 96.55%
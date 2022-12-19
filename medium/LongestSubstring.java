public LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int start = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                start = Math.max(map.get(s.charAt(i))+1, start);
            }
            map.put(s.charAt(i), i);

            max = Math.max(i-start, max);
        }
        return max;
    }
}
// Runtime 11 ms Beats 71.78%
// Memory 45.1 MB Beats 44.38%
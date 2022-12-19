public Main {
    public int firstBadVersion(int n) {
        int lower = 1;
        int upper = n;
        while (lower <= upper) {
            n = lower + (upper - lower)/2;
            if(isBadVersion(n)) {
                upper = n-1;
            }else {
                lower = n+1;
            }
        }
        return lower;
    }
}
//Runtime 17 ms Beats 90.62%
// Memory 39 MB Beats 90.50%
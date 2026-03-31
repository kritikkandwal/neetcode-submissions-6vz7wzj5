class Solution {
    public int mySqrt(int x) {

        for (int i = x; i >= 0; i--) {
            if ((long)i * i <= x) {
                return i;
            }
        }

        return -1;
    }
}

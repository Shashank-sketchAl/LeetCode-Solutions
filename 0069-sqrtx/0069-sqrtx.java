class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int min = 1; 
        int max = x; 
        int ans = 0;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (mid <= x / mid) {
                ans = mid;
                min = mid + 1;
            } else {
                max = mid - 1; 
            }
        }
        return ans;
    }
}
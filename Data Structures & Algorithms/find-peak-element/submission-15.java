class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0;
        int left = 1;
        int right = n - 2;
        if (nums[0] > nums[1]) return 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            } 
            else if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;   // go right
            } 
            else {
                right = mid - 1;  // go left
            }
        }

        
        return n - 1;
    }
}
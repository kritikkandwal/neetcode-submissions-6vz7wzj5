class Solution {
    public int longestConsecutive(int[] nums) {

        int n = nums.length;
        int longest = 0;

        for (int i = 0; i < n; i++) {

            int current = nums[i];
            int count = 1;

            // keep checking next consecutive numbers
            while (true) {
                boolean found = false;

                for (int j = 0; j < n; j++) {
                    if (nums[j] == current + 1) {
                        found = true;
                        current++;
                        count++;
                        break;
                    }
                }

                if (!found) break;
            }

            longest = Math.max(longest, count);
        }

        return longest;
    }
}

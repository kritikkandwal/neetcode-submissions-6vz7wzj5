

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> frqmap = new HashMap<>();
        for (int n : nums) {
            frqmap.put(n, frqmap.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];
        for (int key : frqmap.keySet()) {
            int freq = frqmap.get(key);

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int[] result = new int[k];
        int counter = 0;

        for (int i = bucket.length - 1; i >= 0 && counter < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    result[counter++] = num;
                    if (counter == k) break;
                }
            }
        }

        return result;
    }
}

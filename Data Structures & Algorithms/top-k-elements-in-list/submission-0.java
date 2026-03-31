

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Frequency map
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int n : nums) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }

        // Step 2: Bucket array
        List<Integer>[] bucket = new List[nums.length + 1];

        for (int key : frequencyMap.keySet()) {
            int freq = frequencyMap.get(key);

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        // Step 3: Collect top k frequent elements
        int[] result = new int[k];
        int counter = 0;

        for (int i = bucket.length - 1; i >= 0 && counter < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    result[counter] = num;
                    counter = counter + 1;
                    if (counter == k) break;
                }
            }
        }

        return result;
    }
}

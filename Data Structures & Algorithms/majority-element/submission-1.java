class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int maxcount=0;
        int answer=nums[0];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if (map.get(nums[i]) > maxcount){
                maxcount=map.get(nums[i]);
                answer=nums[i];
            }
        }
        return answer;
    }
}
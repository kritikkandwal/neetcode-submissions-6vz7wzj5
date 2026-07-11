class Solution {
    public int[] getConcatenation(int[] nums) {
       int[] output= new int [2*nums.length];
       for(int i=0;i<nums.length;i++){
        output[i]=nums[i];
       }
       for(int i=0;i<nums.length;i++){
        output[nums.length+i]=nums[i];
       }
       return output;
    } 
}


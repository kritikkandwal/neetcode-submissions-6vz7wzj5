class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left=0;
        int sum=0;
        int count=0;

        int target=k*threshold;

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(i-left+1==k){
                if(sum>=target){
                    count++;
                }
                sum=sum-arr[left];
                left++;
            }
        }
        return count;
    }
}

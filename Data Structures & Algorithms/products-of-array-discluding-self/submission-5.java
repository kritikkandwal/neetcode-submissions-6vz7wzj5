class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] newarr= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int pr=1;
            for(int j=0;j<nums.length;j++){
                if(j!=i){
                    pr=pr*nums[j];

                }
            }
            newarr[i]=pr;
        }
        return newarr;
    }
}  


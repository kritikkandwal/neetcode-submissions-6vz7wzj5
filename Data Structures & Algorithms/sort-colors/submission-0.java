class Solution {
    public void sortColors(int[] nums) {
        quicksort(nums,0,nums.length-1);
    }

    public void quicksort(int[]nums, int left,int right){
        if(left<right){
            int pivot=partition(nums,left,right);
            quicksort(nums,left,pivot-1);
            quicksort(nums,pivot+1,right);

        }
    }

    public int partition(int[] nums,int left,int right){
        int i=left-1;
        int pivot=nums[right];
        for(int j=left;j<right;j++){
            if(nums[j]<pivot){
                i++;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        int temp=nums[i+1];
        nums[i+1]=nums[right];
        nums[right]=temp;
        return i+1;
    }
    
}
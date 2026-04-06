class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int left=0;
        int whitecount=0;
        int result=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(blocks.charAt(i)=='W'){
                whitecount++;
            }

            if(i-left+1==k){
                result=Math.min(result,whitecount);

                if(blocks.charAt(left)=='W'){
                    whitecount--;
                }
                left++;
            }
        }
        return result;
    }
}



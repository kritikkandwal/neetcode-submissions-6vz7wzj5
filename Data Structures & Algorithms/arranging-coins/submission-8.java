class Solution {
    public int arrangeCoins(int n) {
        int temp=n;
        int count=0;
        int result=0;
        for(int i=1;i<=n;i++){
            temp=temp-i;
            
            if(temp<0){
                return count;
            }
            count++;
        }
        return count;  
    }
}

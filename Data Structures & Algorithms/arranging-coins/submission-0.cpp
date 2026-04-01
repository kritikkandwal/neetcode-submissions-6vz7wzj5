class Solution {
public:
    int arrangeCoins(int n) {
       int sum=n;
       int count=-1;
       for(int i=1;i<n;i++){
        sum=sum-i;
        count++;
        if(sum<0){
            return count;
        }
       } 
    }
};
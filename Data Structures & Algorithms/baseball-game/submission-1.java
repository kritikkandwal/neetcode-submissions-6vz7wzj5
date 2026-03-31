class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();

        for(String i : operations){
            if(i.equals("+")){
                int last=st.pop();
                int result=last+st.peek();
                st.push(last);
                st.push(result);
            }
            else if(i.equals("D")){
                int result=2*st.peek();
                st.push(result);
            }
            else if (i.equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(i));
            }
        }
        int sum=0;
        for(int j : st){
            sum=sum+j;
        }
        return sum;
    }
}

















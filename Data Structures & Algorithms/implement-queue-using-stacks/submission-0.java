
class MyQueue {

    Stack<Integer> st;

    public MyQueue() {
        st = new Stack<>();
    }

    public void push(int x) {
        st.push(x);
    }

    public int pop() {
        int top = st.pop();

        if(st.isEmpty()){
            return top;
        }

        int res = pop();
        st.push(top);

        return res;
    }

    public int peek() {

        int top = st.pop();

        if(st.isEmpty()){
            st.push(top);
            return top;
        }

        int res = peek();
        st.push(top);

        return res;
    }

    public boolean empty() {
        return st.isEmpty();
    }
}
class MinStack {

Stack<Integer> s;
Stack<Integer> sortStack;

    public MinStack() {
        s = new Stack<Integer>();
        sortStack = new Stack<Integer>();
    }
    
    public void push(int val) {
        s.push(val);
        if(sortStack.isEmpty() || sortStack.peek()>=s.peek()){
            sortStack.push(val);
        }
    }
    
    public void pop() {
        if(s.peek().equals( sortStack.peek())){
            sortStack.pop();
        }
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return sortStack.peek();
    }
}

class CustomStack {
    int stack[] ;
    int pointer;
    int maxSize;
    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        stack= new int[maxSize];
        pointer = -1;
    }
    
    public void push(int x) {
        
        if(pointer<maxSize-1){
            stack[++pointer] = x;
        }
        
    }
    
    public int pop() {
        
        if(pointer !=-1){
            return stack[pointer--];
        }
        return -1;
    }
    
    public void increment(int k, int val) {
        
        for(int i=0; i<Math.min(k,pointer+1); i++){
            stack[i] += val;
            System.out.println(stack[i]);
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
class MinStack {
    List<Integer> l = new ArrayList<>();
    List<Integer> m = new ArrayList<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        l.add(val);
        if(m.isEmpty()){
            m.add(val);
        } else {
            m.add(Math.min(m.get(m.size()-1),val));
        }
    }
    
    public void pop() {
        l.remove(l.size()-1);
        m.remove(m.size()-1);
    }
    
    public int top() {
        return l.get(l.size()-1);
    }
    
    public int getMin() {
        return m.get(m.size()-1);
    }
}

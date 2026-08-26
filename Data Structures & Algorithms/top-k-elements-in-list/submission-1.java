class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i:nums){
            if(m.get(i) == null)m.put(i,0);
            m.put(i,m.get(i)+1);
        }
        System.out.println(m);
        PriorityQueue<Pair> q = new PriorityQueue<>((a,b) -> Integer.compare(b.b,a.b));
        for(int i:m.keySet()){
            Pair p = new Pair(i,m.get(i));
            q.offer(p);
        }
        int ans[] = new int[k];
        for(int i=0;i<ans.length;i++){
            ans[i] = q.poll().a;
        }
        return ans;
    }
}

class Pair {
    public String toString(){
        return a + "-" + b;
    }
    int a;
    int b;

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
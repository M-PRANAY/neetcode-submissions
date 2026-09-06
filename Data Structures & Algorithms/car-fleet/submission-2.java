
class Solution {
    static void main() {
        System.out.println(carFleet(10,new int[]{8,3,7,4,6,5}, new int[]{4,4,4,4,4,4}));
    }
    public static int carFleet(int target, int[] position, int[] speed) {
        int[][] pairs = new int[position.length][2];

        for (int i = 0; i < position.length; i++) {
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }

        Arrays.sort(pairs, Comparator.comparingInt(x -> x[0]));
        Stack<Double> s = new Stack<>();
        for(int i[]:pairs){
            int dist = target-i[0];
            double time = (double) dist / i[1];
            if(s.isEmpty()){
                s.push(time);
            } else {
                while(!s.isEmpty() && s.peek() <= time){
                    s.pop();
                }
                s.push(time);
            }
        }
        return s.size();
    }
}


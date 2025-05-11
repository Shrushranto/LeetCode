class Solution {
    public int climbStairs(int n) {
        Map<Integer, Integer> mp = new HashMap<>();
        return climbStairs(n, mp);
    }
    
    private int climbStairs(int n, Map<Integer, Integer> mp) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (!mp.containsKey(n)) {
            mp.put(n, climbStairs(n-1, mp) + climbStairs(n-2, mp));
        }
        return mp.get(n);
    }
}
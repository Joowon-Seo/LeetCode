class Solution {
    public int minOperations(int n) {
        
        int cnt = n%2 == 0 ? (n/2)*(n/2):(n/2)*(n/2 +1);

        return cnt;
        
    }
}
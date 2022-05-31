class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
       return IntStream.range(0, tickets.length).map(i -> Math.min(tickets[i], i > k ? tickets[k] -1  : tickets[k])).sum();
        // i가 k 보다 앞에 있다면 최소 k가 0이 되거나 해당 인덱스의 값이 0이 될 때 까지 봐야함으로
        // min(tickets[i], tickets[k])
        
        // i > k 라면 i 부분이 인덱스가 0이 될 때 k는 가장 뒤에 있게됨 tickets[k] - 1상태로
        // 여기서 i < k 와 같이 해석하면 같음
        // 따라서 min(tickets[i], tickets[k] - 1)이 되는 것임
    }
       
}
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        
        Deque<Integer> deque = new ArrayDeque();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < tickets.length; i++) {

            map.put(i, tickets[i]);
            deque.add(i);
        }

        int time = 0;

        while (map.get(k) != 0){
            if (map.get(deque.peek()) == 0){
                deque.poll();
                continue;
            }
            map.put(deque.peek(), map.get(deque.peek()) - 1);
            deque.add(deque.poll());
            time ++;


        }

        return time;
        
    }
}
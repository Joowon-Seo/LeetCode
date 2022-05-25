class Solution {
    public String getPermutation(int n, int k) {
        int[] arr = IntStream.range(1,n+1).toArray();
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());


        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact *= i;
        }
        String result = "";

        k--;

        fact /= n;
        while(list.size() != 0){
            result += list.remove(k/fact);
            k %= fact;
            if (list.size() == 0){
                break;
            }
            fact /= list.size();
        }
        
        return result;
    }
      
    
}
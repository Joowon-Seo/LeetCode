class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int [2];
        ArrayList<Integer> numsList = (ArrayList<Integer>) Arrays.stream(nums).boxed().collect(Collectors.toList());

        retry:
        for (int i = 0; i < numsList.size(); i++) {
            if (numsList.contains(target - numsList.get(i))){
                result[0] = i;
                result[1] = numsList.indexOf(target - numsList.get(i));
                if (result[0] == result[1]){
                    continue retry;
                }
                break;
            }
        }

        
        return result;
    }
}
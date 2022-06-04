class Solution {
    public int maxSubArray(int[] nums) {
        // 현재의 순서에서 전의 합이 +이라면 지금과 합쳐주고
        // 전의 합이 -라면 현재에서 초기화 된다.

        int allMax = nums[0];
        int curMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curMax = Math.max(nums[i], curMax + nums[i]);
            allMax = Math.max(curMax, allMax);
        }


        return allMax;

    }
}
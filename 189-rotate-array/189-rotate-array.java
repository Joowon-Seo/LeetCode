class Solution {
    public void rotate(int[] nums, int k) {
        if (k == 0) {
            return;
        }

        k %= nums.length;


        reversed(nums, 0, nums.length-1);
        reversed(nums, 0, k-1);
        reversed(nums, k, nums.length-1);
        
        
        
    }
    
    
    
    public void reversed (int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;}
    }
        
}
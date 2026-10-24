class Solution {
    public int[] runningSum(int[] nums) {
        int i, j;
        int[] arr = new int[nums.length];
        int sum = 0;
        for ( i = 0 ; i < nums.length; i ++)
        {
            sum += nums[i];
            arr[i] = sum;
        }
        return arr;
    }
}
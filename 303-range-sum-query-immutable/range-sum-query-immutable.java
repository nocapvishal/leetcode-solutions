class NumArray {
    int[] nums;

    public NumArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }

        nums = arr;
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return nums[right];
        }

        return nums[right] - nums[left - 1];
    }
}
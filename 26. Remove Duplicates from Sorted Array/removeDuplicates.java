class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[length] != nums[i]) {
                length++;
                nums[length] = nums[i];
            }
        }
        return length + 1;
    }
}
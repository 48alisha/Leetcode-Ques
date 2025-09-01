class Solution {
    public int countHillValley(int[] nums) {
        int i = 1;
        int j = i - 1;
        int k = i + 1;
        int count = 0;

        for (; k < nums.length; ) {
            // skip duplicates on the left
            while (j >= 0 && nums[i] == nums[j]) {
                j--;
            }

            // skip duplicates on the right
            while (k < nums.length && nums[i] == nums[k]) {
                k++;
            }

            if (j >= 0 && k < nums.length) {
                if ((nums[i] > nums[j] && nums[i] > nums[k]) ||
                    (nums[i] < nums[j] && nums[i] < nums[k])) {
                    count++;
                }
            }

            // move window
            i = k;
            j = i - 1;
            k = i + 1;
        }
        return count;
    }
}

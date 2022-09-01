/**
 * Constraints:
 *     2 <= nums.length <= 10^4
 *     -10^9 <= nums[i] <= 10^9
 *     -10^9 <= target <= 10^9
 *     Only one valid answer exists.
 */
class Solution {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            final int temp = target - nums[i];

            for (int j = (i+1); j < nums.length; j++) {
                if (temp == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }

        throw new RuntimeException("Result not found");
    }

}


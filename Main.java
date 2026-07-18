public class Main {

    static class Solution {
        public int longestOnes(int[] nums, int k) {

            int left = 0;
            int zeroCount = 0;
            int maxLength = 0;

            for (int right = 0; right < nums.length; right++) {

                if (nums[right] == 0) {
                    zeroCount++;
                }

                if (zeroCount > k) {
                    if (nums[left] == 0) {
                        zeroCount--;
                    }
                    left++;
                }

                if (zeroCount <= k) {
                    int currentLength = right - left + 1;
                    maxLength = Math.max(maxLength, currentLength);
                }
            }

            return maxLength;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;

        int ans = obj.longestOnes(nums, k);

        System.out.println("Maximum consecutive ones = " + ans);
    }
}
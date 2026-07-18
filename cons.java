public class cons {

    static class Solution {

        public int findMaxConsecutiveOnes(int[] nums) {

            int count = 0;
            int max = 0;
            int n = nums.length;

            for (int i = 0; i < n; i++) {

                if (nums[i] == 1) {
                    count++;
                    max = Math.max(max, count);
                } else {
                    count = 0;
                }
            }

            return max;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {1, 1, 0, 1, 1, 1};

        int ans = obj.findMaxConsecutiveOnes(nums);

        System.out.println("Maximum Consecutive Ones = " + ans);
    }
}

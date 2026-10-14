class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int j=0;
        for(int i=0;i<n;i++){
            int k=nums[i]*nums[i];
            nums[j]=k;
            j++;        
            }
        Arrays.sort(nums);
        return nums;
        
    }
}
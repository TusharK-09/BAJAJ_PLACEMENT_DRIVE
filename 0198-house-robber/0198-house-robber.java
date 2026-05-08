class Solution {
    public int rob(int[] nums) {
        //state dp[i] =  max robbed withour alarm
        //tranisition dp[i] = take or skip
        //take -> dp[i-2] + nums[i]
        //leave -> dp[i-1]

        int n = nums.length;
        int[] dp = new int[n];

        //edge case
        if(n == 1) return nums[0];

        //base state
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0] , nums[1]);

        //transition
        for(int i=2; i<n; i++){
            dp[i] = Math.max(dp[i-1] , dp[i-2] + nums[i]);
        }

        return dp[n-1];
    }
}
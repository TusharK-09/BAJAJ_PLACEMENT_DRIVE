class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        //build prefix sum array ------ LEFT SUM
        int[] prefix = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(i == 0){
                prefix[i] = nums[i];
            }else{
                prefix[i] = prefix[i-1] + nums[i];
            }
        }

        //build suffix sum array ------ RIGHT SUM
        int[] suffix = new int[nums.length];
        for(int i=nums.length - 1; i>=0; i--){
            if(i == nums.length - 1){
                suffix[i] = nums[i];
            }else{
                suffix[i] = suffix[i+1] + nums[i];
            }
        }

        //now build answer
        for(int i=0; i<nums.length; i++){
            if(i == 0 && suffix[i+1] == 0){
                return i;
            }else if(i == nums.length - 1 && prefix[i-1] == 0){
                return i;
            }else{
                if(i>0 && i<nums.length - 1 && prefix[i-1] == suffix[i+1]){
                    return i;
                }
            }
        }
        return -1;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //hashmap approach
        Map<Integer , Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int current = nums[i];
            int needed = target - current;
            if(map.containsKey(needed)){
                return new int[]{i,map.get(needed)};
            }
            map.put(current , i);
        }
        return new int[]{};
    }
}
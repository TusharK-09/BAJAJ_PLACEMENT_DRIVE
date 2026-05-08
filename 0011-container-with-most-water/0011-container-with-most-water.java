class Solution {
    public int maxArea(int[] height) {
        int maxWater = Integer.MIN_VALUE;
        int l = 0;
        int r = height.length - 1;
        while(l < r){
            int width = r - l;
            int holdCapacity = Math.min(height[l] , height[r]);
            int waterHolded = width * holdCapacity;
            maxWater = Math.max(maxWater ,waterHolded);

            //drop shorter wall and keep the higher wall
            if(height[l] < height[r]){
                l++;
            }else if(height[l] > height[r]){
                r--;
            }else{
                l++;
                r--;
            }
        }
        return maxWater;
    }
}
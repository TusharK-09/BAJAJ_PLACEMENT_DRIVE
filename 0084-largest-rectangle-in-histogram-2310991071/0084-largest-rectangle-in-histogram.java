class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for(int i=0; i<=heights.length; i++){
            int currH = (i==heights.length) ? 0 :  heights[i];

            while(!stack.isEmpty() && currH < heights[stack.peek()]){
                int h = heights[stack.pop()];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea , h * w);
            }

            stack.push(i);
        }

        return maxArea;
    }
}
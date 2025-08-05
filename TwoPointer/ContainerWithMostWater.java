
class Solution {
    public int maxArea(int[] height) {
         if (height == null || height.length < 2) return 0;
        int n= height.length;
        int left=0; 
        int right= height.length-1;
        int maxWater=0;
        while(left<right){
            int w=right-left;
            int minHeight=Math.min(height[left], height[right]);
            int width= w * minHeight;
            maxWater = Math.max(width, maxWater);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
            
        }
         return maxWater;
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i=0;
    
        for(int j=i;j<n;j++){
          if(nums[i]!=nums[j]){
           i++;
          nums[i]=nums[j];
            }
        }
        return i+1;
    }
}

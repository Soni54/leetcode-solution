
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int left=0, right=n-1;
        while(left<right){
            if(target < (numbers[left] + numbers[right])){
                right--;
            }
            else if(target> (numbers[left] + numbers[right])){
                left++;
            }
            else{
                return new int[]{left + 1, right + 1}; 
            }
        }
         return new int[]{};
    }
}

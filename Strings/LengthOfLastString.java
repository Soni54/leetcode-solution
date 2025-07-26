class Solution {
    public int lengthOfLastWord(String s) {
        String s1=s.trim();
        int result=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) == ' '){
                result=0;
            }
            else{
            result++;
        }
        }
        return result;
    }
}

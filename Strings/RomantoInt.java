class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanInt = new HashMap<>();
        romanInt.put('I', 1);
        romanInt.put('V', 5);
        romanInt.put('X', 10);
        romanInt.put('L', 50);
        romanInt.put('C', 100);
        romanInt.put('D', 500);
        romanInt.put('M', 1000);
        int res=0;
        for(int i=0;i<s.length();i++){
            if(i+1 <s.length() && romanInt.get(s.charAt(i))<romanInt.get(s.charAt(i+1))){
                res+=romanInt.get(s.charAt(i+1))-romanInt.get(s.charAt(i));
           i++;
            }
            else{
                res+=romanInt.get(s.charAt(i));
            }
            
        }
        return res;
    }
}

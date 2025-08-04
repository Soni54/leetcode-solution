
class Solution {
    public boolean isSubsequence(String s, String t) {
    
     int p1=0, m=s.length();
     int p2=0, n=t.length();
     while(p1<m && p2<n){
        if(s.charAt(p1)==t.charAt(p2) && p1<m && p2<n){
            p1++;
        }
        p2++;
     }
     return p1==m;
    }
}

import java.util.*;

class Solution {
    public long solution(long n) {

        String s = String.valueOf(n);
        char[] c = new char[s.length()];
        
        for(int i=0; i<c.length; i++){
            c[i] = s.charAt(i);
        }
        
        Arrays.sort(c);
        s = "";
        
        for(int i=c.length-1; i>=0; i--){
            s += c[i];
        }
        
        return Long.parseLong(s);
    }
}
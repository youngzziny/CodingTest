import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String s = Integer.toString(n);
        
        for(int i=0; i<s.length(); i++){
            if(i != s.length()-1){
                answer += Integer.parseInt(s.substring(i,i+1));
            }else{
                answer += Integer.parseInt(s.substring(i));
            }
        }

        return answer;
    }
}
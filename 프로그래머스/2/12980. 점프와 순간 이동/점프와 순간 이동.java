import java.util.*;

public class Solution {
    public int solution(int n) {
        int battery = 1;
        
        while(true){
            if(n == 1) break;
            if(n%2 != 0) battery++;               
            n /= 2;            
        }

        return battery;
    }
}
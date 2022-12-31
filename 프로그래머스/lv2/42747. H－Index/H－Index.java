import java.util.*;
class Solution {
    public int solution(int[] citations) {
        
        int count = 0;
        
        Arrays.sort(citations);
        
        int h = citations[citations.length-1];
        
        if(h == 0){
            return 0;
        }

        for(int i=citations.length-1; i>=0; i--){
            if(citations[i] >= h){
                count++;                
                if(count == h){
                    break;
                }
            }else{
                count = 0;
                h--;
                i=citations.length;
            }                
        }
        
        return count;
    }
}
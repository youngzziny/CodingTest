import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        List<Integer> size = new ArrayList<>();
        
        Arrays.sort(tangerine);
        
        int temp = 1;
        for(int i=0; i<tangerine.length; i++){
            if(i == tangerine.length-1){
                size.add(temp);
            }else if(tangerine[i] != tangerine[i+1]){
                size.add(temp);
                temp = 1;
            }else{
                temp++;
            }          
        }

        Collections.sort(size, Collections.reverseOrder());
        
        for(int i:size){
            k -= i;
            answer++;
            if(k <= 0) break;
        }
        
        return answer;
    }
}
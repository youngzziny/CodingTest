import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> list = new ArrayList<>(arr.length);
        
        int min = arr[0];
        int minIndex = 0;
        
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
                minIndex = i;
            }
            
            list.add(arr[i]);
        }
        
        list.remove(minIndex);
        
        if(list.size()==0){
            int[] answer = {-1};
            
            return answer;
        }else{
            int[] answer = new int[list.size()];
            for(int i=0; i<answer.length; i++){
                answer[i] = list.get(i);
            }
            
            return answer;
        }
    }
}
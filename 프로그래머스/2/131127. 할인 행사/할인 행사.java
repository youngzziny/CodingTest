import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;        
        List<String> wishlist = new ArrayList<>();
        
        for(int i=0; i<want.length; i++){
            
            int count = number[i];
            
            while(count > 0){
                wishlist.add(want[i]);
                count--;
            }    
        }
        
        for(int i=0; i<discount.length-10+1; i++){
            // System.out.println("----새로운 탐색 시작----");
            List<String> temp = new ArrayList<>(wishlist);
            
            for(int j=0; j<10; j++){
                if(temp.contains(discount[i+j])){
                    // System.out.println(discount[i+j]+" 있음");
                    temp.remove(discount[i+j]);
                }else{
                    // System.out.println(discount[i+j]+" 없음");
                    break;
                }
            }
            if(temp.size() == 0) {
                answer++;
                // System.out.println("성공횟수 : "+answer);
            }           
        }       
        
        return answer;
    }
}
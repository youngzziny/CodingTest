import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        HashMap<Integer,Integer> classroom = new HashMap(); // key : 번호, value : 체육복 수
        
        for(int i=1; i<n+1; i++){ // 체육복 모두 1개씩 지급, 학급 번호는 1번부터 시작
            classroom.put(i, 1);            
        }
        
        for(int i=0; i<lost.length; i++){ // 도난당한 번호는 체육복수 - 1
            classroom.put(lost[i], classroom.get(lost[i]) - 1);
        }
        
        for(int i=0; i<reserve.length; i++){ // 여벌의 체육복이 있는 번호는 체육복수 + 1
            classroom.put(reserve[i], classroom.get(reserve[i]) + 1);
        }
        
        // System.out.println(classroom);
        
        for(int i=1; i<n+1; i++){
                
            if(classroom.get(i) == 0){ // 체육복이 없는 경우
               if(i == 1){ // 1번은 2번한테만 빌릴 수 있음
                   if(classroom.get(2) == 2){
                       classroom.put(1, 1);
                       classroom.put(2, 1);
                   }
               }else if(i == n){ // n번은 n-1번한테만 빌릴 수 있음
                   if(classroom.get(n-1) == 2){
                       classroom.put(n, 1);
                       classroom.put(n-1, 1);
                   }
               }else{ // 중간에 낀 번호
                   if(classroom.get(i-1) == 2){ // 앞번호한테 빌리는 경우
                       classroom.put(i, 1);
                       classroom.put(i-1, 1);
                   }else if(classroom.get(i+1) == 2){ // 뒷번호한테 빌리는 경우
                       classroom.put(i, 1);
                       classroom.put(i+1, 1);
                   }
               }
            }
        }
        
        int answer = 0;
        
        for(int i=1; i<n+1; i++){ // 체육복 검사
            if(classroom.get(i) >= 1 ){ // 체육복을 1개 이상 가진 학생 수
                answer++;
            }
        }
        
        return answer;
    }
}
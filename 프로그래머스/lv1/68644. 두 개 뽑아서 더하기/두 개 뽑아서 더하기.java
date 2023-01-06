import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<Integer>(); // 더한 값의 중복이 없게 HashSet 사용
        
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }    
        }
        
        int[] answer = new int[set.size()]; // 답을 담을 배열 생성
                    
        Integer[] arr = set.toArray(new Integer[0]); // Integer형의 Hashset을 Integer형의 배열로 바꿔줌
        
        for(int i=0; i<arr.length; i++){ // Integer형의 배열 -> int 배열로 바꿔줌
            answer[i] = arr[i];
        }
        
        Arrays.sort(answer); // 오름차순 정렬
        
        return answer;
    }
}
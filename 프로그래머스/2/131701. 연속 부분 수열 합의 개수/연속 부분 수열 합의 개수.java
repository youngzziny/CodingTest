import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] elements) {
        
        Set<Integer> hap = new HashSet<>(); // 중복 없이 합을 담기 위해 set 사용
        
        
        for(int length=1; length<elements.length+1; length++){            
            
            // System.out.println("---길이가 " + length + "인 경우---");
            
            for(int j=0; j<elements.length; j++){
                
                int sum = 0;
                int count = 0; // 현재 합한 수의 개수
                int index = j; // 리스트에 숫자 추가 후 새로 합을 시작할 숫자
                
                while(count < length){
                    sum += elements[index];
                    // System.out.println("+" + elements[index]);
                    count++;

                    if(index == elements.length-1){ // 연속수열 - 마지막 인덱스일 경우 처음으로
                        index = 0;
                    }
                    else{
                        index++;
                    }
                }
                hap.add(sum);
                // System.out.println("리스트에 " + sum + " 추가");
            }            
        }
        
        return hap.size();
    }
}
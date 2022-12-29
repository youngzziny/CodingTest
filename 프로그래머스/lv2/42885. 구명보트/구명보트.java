import java.util.Arrays;
class Solution {

    public int solution(int[] people, int limit) {
 
        Arrays.sort(people);

        int maxIndex = people.length - 1;
        int count = 0;

        for(int i=0; i<people.length; i++){
            if(i == maxIndex){
                count++;
                break;
            }else if(i > maxIndex){
                break;
            }else if(people[i] + people[maxIndex] > limit){
                count++;
                maxIndex--;
                i = i-1;
            }else{
                count++;
                maxIndex--;
            }
        }
        
        return count;
    }
}
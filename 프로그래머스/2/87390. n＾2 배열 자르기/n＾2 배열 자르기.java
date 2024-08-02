class Solution {
    public int[] solution(int n, long left, long right) {
        
        int[] arr = new int[Long.valueOf(right).intValue()-Long.valueOf(left).intValue()+1];        
        
        int count = 0;
        int index = 0;
        
        // 시작좌표(leftA,leftB)
        int leftA = (int) (left/n);
        int leftB = (int) (left%n);
        // 종료좌표(rightA,rightB)
        int rightA = (int) (right/n);
        int rightB = (int) (right%n);;
               
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){

                if(i < leftA || (i == leftA && j < leftB)) continue;
                if((i == rightA && j > rightB) || i > rightA) break;

                arr[index] = i>j?i+1:j+1;
                index++;
            }
        }
    
        return arr;
    }
}
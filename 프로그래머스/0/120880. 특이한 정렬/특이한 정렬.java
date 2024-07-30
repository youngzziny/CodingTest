class Solution {
    public int[] solution(int[] numlist, int n) {
        
        for(int i=0; i<numlist.length; i++){
            for(int j=i+1; j<numlist.length; j++){

                int gap1 = Math.abs(n - numlist[i]);
                int gap2 = Math.abs(n - numlist[j]);

                if(gap1 == gap2){
                    if(numlist[j] > numlist[i]){
                        int temp = numlist[i];
                        numlist[i] = numlist[j];
                        numlist[j] = temp;
                    }
                }else if(gap1 > gap2){
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }
        
        return numlist;
    }
}
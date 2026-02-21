class Solution {
    public int hIndex(int[] citations) {
        // code here
        Arrays.sort(citations);
        int n=citations.length;
        int H=0;
        
        for(int i=0;i<citations.length;i++){
            int papers=n-i;
            
            if(citations[i]>=papers){
                H=papers;
                break;
            }
        }
        return H;
    }
}
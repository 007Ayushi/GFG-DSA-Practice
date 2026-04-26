class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        
        //linear search 
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                cnt++;
            }
        }
        return cnt;
    }
}

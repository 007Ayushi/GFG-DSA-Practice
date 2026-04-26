class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
       
        
        int lo=0,hi=arr.length-1;
        int idx=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            
            if(arr[mid]<=x){
                idx=mid;
                lo=mid+1;
            }
            else{
               hi=mid-1;
            }
        }
        return idx;
    }
}

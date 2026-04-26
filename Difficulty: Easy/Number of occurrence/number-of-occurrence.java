class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        
        //linear search -o(n)
        // int cnt=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==target){
        //         cnt++;
        //     }
        // }
        // return cnt;
        
        
        //Lower Bound
        int lo=0,hi=arr.length-1;
        int lb=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            
            if(arr[mid]==target){
             lb=mid;
             hi=mid-1;
            }
            else if(arr[mid]>target){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        
        //upper bound
        lo=0;hi=arr.length-1;
        int ub=-1;
        
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            
            if(arr[mid]==target){
                ub=mid;
                lo=mid+1;
            }
            else if(arr[mid]>target){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        
        if(lb==-1)return 0;
        return ub-lb+1;
    }
}

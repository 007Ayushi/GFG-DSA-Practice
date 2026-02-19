class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        //Using Binary Search
        
        int lb=lowerBound(arr,target);
        int ub=upperBound(arr,target);
        
        if(lb==-1)return 0;
        return ub-lb+1;
    }
    
    int lowerBound(int []arr,int target){
        int lo=0,hi=arr.length-1;
        int lb_idx=-1;
        
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            
            if(arr[mid]==target){
                lb_idx=mid;
                hi=mid-1;
            }
            else if(arr[mid]>target){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return lb_idx;
    }
    int upperBound(int []arr,int target){
        int lo=0,hi=arr.length-1;
        int ub_idx=-1;
        
       
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            
            if(arr[mid]==target){
                ub_idx=mid;
                lo=mid+1;
            }
            else if(arr[mid]>target){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ub_idx;
    }
}

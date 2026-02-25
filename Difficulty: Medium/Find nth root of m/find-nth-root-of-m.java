class Solution {
    public int nthRoot(int n, int m) {
        // code here
        
        int lo=0;
        int hi=m;
        
        while(lo<=hi){
            int mid=(lo+hi)/2;
            
            
            if(Math.pow(mid,n)==m){
                return mid;
            }
            else if(Math.pow(mid,n)>m){
                hi=mid-1;
            }
            else{lo=mid+1;
        }
    }
    return -1;
    
    }
}
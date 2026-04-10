class Solution {
    public int search(int arr[], int x) {
        // code here
        
        //tc=(n) and sc=O(1)
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}

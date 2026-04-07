class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        Arrays.sort(arr);
        int j=arr.length-1;
        while(j>0){
            if(arr[j]==arr[j-1]){
                j--;
            }
            else{
                return arr[j-1];
            }
        }
        return -1;
    }
}
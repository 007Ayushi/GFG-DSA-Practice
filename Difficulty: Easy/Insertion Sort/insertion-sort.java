class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        
        int n=arr.length;
        for(int i=1;i<n;i++){
            for(int j=i;j>=1 && arr[j]<arr[j-1];j--){
                swap(arr,j,j-1);
            }
        }
    }
    
    public void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
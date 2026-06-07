class Solution {
    public static void arrayTraversal(int[] arr) {
        // Code here
        traversal(arr,0);
    }
    public static void traversal(int []arr,int i){
        
        if(i==arr.length)return;
        System.out.print(arr[i]+" ");
        traversal(arr,i+1);
    }
}

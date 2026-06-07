class Solution {
    
    ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        // code here
        
        ArrayList<Integer> arr1=new ArrayList<>();
        helper(arr,0,arr1);
        return ans;
    }
    public void helper(int []arr,int i,ArrayList<Integer> arr1){
        
        if(i==arr.length){
            ans.add(new ArrayList<>(arr1));
            return;
        }
        
        arr1.add(arr[i]);
        helper(arr,i+1,arr1);
        arr1.remove(arr1.size()-1);
        helper(arr,i+1,arr1);
    }
}
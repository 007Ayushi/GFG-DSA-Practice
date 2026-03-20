class Solution {
    
    ArrayList<Integer> at=new ArrayList<>();
    
    public boolean path(Node root, ArrayList<Integer> at, int target){
        
        if(root==null) return false;
        
        at.add(root.data);
        
        if(root.data==target) return true;
        
        if(path(root.left,at,target) || path(root.right,at,target)){
            return true;
        }
        
        at.remove(at.size()-1);
        
        return false;
    }
    public ArrayList<Integer> Ancestors(Node root, int target) {
        // add your code here
        if(root==null || root.data==target){
            return at;
        }
        
        if(root.left==null && root.right==null){
            return at;
        }
        
        boolean bt=path(root,at,target);
        
        at.remove(at.size()-1);
        Collections.reverse(at);
        
        return at;
    }
}
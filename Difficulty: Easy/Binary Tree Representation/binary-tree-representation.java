// User function Template for Java

class Solution {
    
    // class Node{
    //     int val;
    //     Node left;
    //     Node right;
        
    //     public Node(int val){
    //         this.val=val;
    //     }
   // }
    public static void createTree(Node root0, ArrayList<Integer> v) {
        // Code here
        
        //Level 1
        root0.left=new Node(v.get(1));
        root0.right=new Node(v.get(2));
        
        
        //Level 2 - Left subtree
        root0.left.left=new Node(v.get(3));
        root0.left.right=new Node(v.get(4));
        
        
        //Level 3 -right subtree
        root0.right.left=new Node(v.get(5));
        root0.right.right=new Node(v.get(6));
        
    }
}
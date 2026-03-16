// User function Template for Java

class Solution {

    public static int countNodes(Node root) {
        // Code here
        if(root==null)return 0;
        int a=1;
        int b=countNodes(root.left);
        int c=countNodes(root.right);
        
        return a+b+c;
    }
}
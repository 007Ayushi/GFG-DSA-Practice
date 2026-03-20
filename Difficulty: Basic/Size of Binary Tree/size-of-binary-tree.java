/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static int getSize(Node node) {
        // code here
        if(node==null)return 0;
        int a=1;//for the root node
        int b=getSize(node.left);
        int c=getSize(node.right);
        return a+b+c;
    }
}
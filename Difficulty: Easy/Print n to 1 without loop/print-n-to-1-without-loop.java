class Solution {
    void printNos(int n) {
        // code here
        
        //base case
        if(n==0)return ;
        System.out.print(n+" ");
        printNos(n-1);
    }
}
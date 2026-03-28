class Solution {
    void printRightHalfPyramid(int n) {
        // code here
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
               sb.append("*");
               sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
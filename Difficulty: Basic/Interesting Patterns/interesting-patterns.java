class Solution {
    static String[] interestingPattern(int N) {
    int size = 2 * N - 1;
    String[] ans = new String[size];

    for (int i = 0; i < size; i++) {
        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < size; j++) {

            int val = N - Math.min(Math.min(i, j), 
                      Math.min(size - 1 - i, size - 1 - j));

            sb.append(val);
        }

        ans[i] = sb.toString();
    }

    return ans;
}
};
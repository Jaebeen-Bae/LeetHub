class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        int len = columnTitle.length();
        for (int i = 0; i < len; i++) {
            int idx = len-1-i;
            result += Math.pow(26,i)*(columnTitle.charAt(idx)-'A'+1);
        }
        return result;
    }
}
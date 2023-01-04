class Solution {
    public int lengthOfLastWord(String s) {
        String[] parseString = s.split("\\s+");
        return parseString[parseString.length-1].length();
    }
}
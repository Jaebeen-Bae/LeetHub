class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.toUpperCase().equals(word)) {
            return true;
        }
        else if(word.toLowerCase().equals(word)) {
            return true;
        }     
        else {  
            for(int i=1; i < word.length(); i++) {
                if(Character.isUpperCase(word.charAt(i))) {
                    return false;
                }                
            }
            return true;
        }
    }
}
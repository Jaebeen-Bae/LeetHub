class Solution {
    public boolean isHappy(int n) {
        String str = String.valueOf(n);
        List<String> list = new ArrayList<>();
        while(!str.equals("1")) {      
            int number = 0;
            for(int i=0; i< str.length(); i++) {
                int mathNumber = Character.getNumericValue(str.charAt(i));
                number += Math.pow(mathNumber, 2);            
            }
            str = String.valueOf(number);
            for (String value : list) {
                if(value.equals(str)) return false;
            }
            list.add(str);
        }
        return true;
    }
}
class Solution {
    public List<String> printVertically(String s) {
        String[] arr = s.split("\\s");
        int maxLegnth = Arrays.stream(arr).mapToInt(String::length).max().getAsInt();
        List<String> list = new ArrayList<>();
        for(int i=0; i<maxLegnth; i++) {
            String data = "";
            for(String str : arr) {
                if(str.length() <= i) {
                    data = data + " ";
                }
                else {
                    data = data + str.charAt(i);
                }
            }
            String result = data.replaceAll("\\s+$","");            
            if(result.length() > 0) { 
                list.add(result);                
            }
        }
        return list;
    }
}